package org.cegeka.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class FileWriterUtil {

    private Path filepath;

    public FileWriterUtil(String filepath) {
        this.filepath = Paths.get(filepath);
    }

    public void appendToFile(String line) throws IOException {
        Files.write(filepath, Collections.singletonList(line), StandardOpenOption.APPEND);
    }
}
