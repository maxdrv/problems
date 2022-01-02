package org.home.maxdrv.first_bad_version;

public class BadVersionHolder {

    private static int badVersionStatic;

    public static int getBadVersionStatic() {
        return badVersionStatic;
    }

    public static void setBadVersionStatic(int badVersion) {
        badVersionStatic = badVersion;
    }
}
