package org.home.maxdrv.memory;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Memory {

    private static final File MEMO_FILE = new File("garbage/memory.txt");
    private static final int MAX_VOLUME = 100;
    private static final String ZERO_BYTE = "00000000";

    private final RandomAccessFile memoFile;

    public Memory() throws IOException {
        if (!new File("garbage").exists()) {
            Files.createDirectory(Paths.get("garbage"));
        }

        String emptyMemory = IntStream.range(0, MAX_VOLUME)
                .mapToObj(i -> ZERO_BYTE)
                .collect(Collectors.joining());
        Files.writeString(MEMO_FILE.toPath(), emptyMemory);

        this.memoFile = new RandomAccessFile(MEMO_FILE, "rw");
    }

    public void write(long address, ByteString b) throws IOException {
        validate(address);
        memoFile.seek(address * 8);
        memoFile.writeBytes(b.value());
    }

    public ByteString read(long address) throws IOException {
        validate(address);
        memoFile.seek(address * 8);
        byte[] bytes = new byte[8];
        memoFile.read(bytes, 0, 8);
        return new ByteString(new String(bytes));
    }

    private static void validate(long address) {
        if (address < 0 || address >= MAX_VOLUME) {
            throw new IndexOutOfBoundsException("0-99");
        }
    }
}
