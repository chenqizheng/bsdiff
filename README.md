# BSDiff

BSDiff 资源下载时候的patch

### 1. 将测试文件push到手机上

```bash
adb push ./sample/sampledata/version1 /sdcard/Android/data/me.chen.bsdiff.sample/cache/version1
adb push ./sample/sampledata/version2_version1.patch /sdcard/Android/data/me.chen.bsdiff.sample/cache/version2_version1.patch
adb push ./sample/sampledata/version2 /sdcard/Android/data/me.chen.bsdiff.sample/cache/version2
```

### 2. patch后SHA1和MD5是一样的

### 资料

[test](./sample/test.md)

[bsdiff](http://www.daemonology.net/bsdiff/)

[SmartAppUpdates](https://github.com/cundong/SmartAppUpdates)

