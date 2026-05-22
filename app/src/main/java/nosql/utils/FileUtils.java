/*
 * utils - Just test-learn with javalin and in future with MongoDB
 * Copyright 2026 - 2026 tutosrive
 * Licence: GPL-3
 * More information: https://github.com/tutosrive/javalin-with-mongodb-learn/blob/main/LICENSE
 * Author: tutosrive (tutosrive@Dev2Forge.software)
 * 
 * File: \FileUtils.java
 * Created: Friday, 22nd May 2026 1:16:29 pm
 * -----
 * Last Modified: Friday, 22nd May 2026 1:39:29 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtils {
    private final static Logger LOG = Logger.getLogger(FileUtils.class.getSimpleName());

    private final static boolean exists(Path filePath) {
        return filePath.toFile().exists();
    }

    public final static String readFile(Path filePath) {
        String content = "File don't exists";
        if (FileUtils.exists(filePath)) {
            try {
                content = Files.readString(filePath);
            } catch (Exception e) {
                LOG.log(Level.SEVERE, e.getMessage(), e);
            }
        }
        return content;
    }

    public final static void saveFileToData(String filename, String content) {
        Path path = Paths.get(String.format("data/%s", filename));
        try {
            Files.writeString(path, content);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public final static String readFileData(String filename) {
        Path path = Paths.get(String.format("data/%s", filename));
        return FileUtils.readFile(path);
    }
}