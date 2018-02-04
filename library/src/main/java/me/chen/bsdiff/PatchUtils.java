package me.chen.bsdiff;

/**
 * Created by Chen on 04/02/2018.
 */

public class PatchUtils {
    static {
        System.loadLibrary("bspatch");
    }

    public static native int patch(String oldFilePath, String newFilePath,
                                   String patchPath);
}
