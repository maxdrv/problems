package org.home.maxdrv.memory;

import org.home.maxdrv.util.enumerations.IntValue;

public enum Quantity implements IntValue {

    BYTE(8),
    WORD(16),
    DWORD(32),
    QUAD_WORD(64),
    LONG_WORD(128);

    private final int value;

    Quantity(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

}
