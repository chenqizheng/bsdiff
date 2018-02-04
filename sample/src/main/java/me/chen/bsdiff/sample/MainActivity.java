package me.chen.bsdiff.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.File;

import me.chen.bsdiff.PatchUtils;

public class MainActivity extends AppCompatActivity {

    private TextView mInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfo = findViewById(R.id.info);
        findViewById(R.id.patch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyPatch();
                setFileInfo();
            }
        });
    }

    private void setFileInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("version2 SHA1 :");
        stringBuffer.append(FileUtil.fileToSHA1(getCacheFilePath("version2")));
        stringBuffer.append("\n");
        stringBuffer.append("version2 MD5 :");
        stringBuffer.append(FileUtil.fileToMD5(getCacheFilePath("version2")));
        stringBuffer.append("\n");
        stringBuffer.append("\n");

        stringBuffer.append("version2 after patch SHA1 :");
        stringBuffer.append(FileUtil.fileToSHA1(getCacheFilePath("version2_after_patch")));
        stringBuffer.append("\n");
        stringBuffer.append("version2 after patch MD5 :");
        stringBuffer.append(FileUtil.fileToMD5(getCacheFilePath("version2_after_patch")));
        stringBuffer.append("\n");
        mInfo.setText(stringBuffer.toString());
    }

    private void applyPatch() {
        PatchUtils.patch(getCacheFilePath("version1"), getCacheFilePath("version2_after_patch"), getCacheFilePath("version2_version1.patch"));
    }

    private String getCacheFilePath(String fileName) {
        return getExternalCacheDir() + File.separator + fileName;
    }
}
