package org.home.maxdrv;

import org.home.maxdrv.first_bad_version.VersionControl;

/**
 * https://leetcode.com/problems/first-bad-version/
 */
public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;

        while (l < h) {
            int m = l + ((h - l) >> 1);

            if (isBadVersion(m)) {
                h = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

}
