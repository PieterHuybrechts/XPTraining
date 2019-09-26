package org.cegeka.utils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;


public class FileWriterUtilIntegrationTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private FileWriterUtil fileWriterUtil;
    private File temporaryFile;

    @Before
    public void setUp() throws Exception {
        temporaryFile = temporaryFolder.newFile();
        fileWriterUtil = new FileWriterUtil(temporaryFile.getAbsolutePath());
    }

    @Test
    public void appendToFile() throws IOException {
        //Tip: use Files::readAllLines && File::toPath

    }
}