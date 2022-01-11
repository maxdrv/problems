package org.home.maxdrv.memory;

public class MemoryCell {

    private final Quantity quantity;
    private final String bits;

    private MemoryCell(Quantity quantity, String bits) {
        this.quantity = quantity;
        validate(bits, quantity.value());
        this.bits = bits;
    }

    private static void validate(String bits, int max) {
        if (bits.length() > max) {
            throw new RuntimeException("8)");
        }
        for (char ch : bits.toCharArray()) {
            if (ch != '1' && ch != '0') {
                throw new RuntimeException("!01");
            }
        }
    }

    public static MemoryCell byteCell(String bits) {
        return new MemoryCell(Quantity.BYTE, bits);
    }

    public String getBits() {
        return bits;
    }

    public int getSize() {
        return quantity.value();
    }

    @Override
    public String toString() {
        return "|" + quantity.value() + "|" + bits;
    }
}
