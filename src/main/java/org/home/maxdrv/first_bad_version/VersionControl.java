package org.home.maxdrv.first_bad_version;

public class VersionControl {

    public boolean isBadVersion(int version) {
        return version >= BadVersionHolder.getBadVersionStatic();
    }

}
