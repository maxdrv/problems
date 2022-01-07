package org.home.maxdrv.memory;

public record ByteString(String value) {

    public ByteString {
        if (value.length() > 8) {
            throw new RuntimeException("8)");
        }
        for (char ch : value.toCharArray()) {
            if (ch != '1' && ch != '0') {
                throw new RuntimeException("!01");
            }
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
