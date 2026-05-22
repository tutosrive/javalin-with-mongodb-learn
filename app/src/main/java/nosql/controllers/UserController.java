/*
 * controllers - Just test-learn with javalin and in future with MongoDB
 * Copyright 2026 - 2026 tutosrive
 * Licence: GPL-3
 * More information: https://github.com/tutosrive/javalin-with-mongodb-learn/blob/main/LICENSE
 * Author: tutosrive (tutosrive@Dev2Forge.software)
 * 
 * File: \UserController.java
 * Created: Thursday, 21st May 2026 8:51:09 pm
 * -----
 * Last Modified: Thursday, 21st May 2026 9:40:20 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql.controllers;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import io.javalin.http.Context;

public class UserController {
    private Path urlData;
    private String dataFile;

    public UserController() {
        this.urlData = Paths.get("data/users.json");
        this.dataFile = this.getContentData();
    }

    public final String getAllUsers(Context ctx) {
        return this.dataFile;
    }

    private final String getContentData() {
        File file = new File(this.urlData.toAbsolutePath().toString());
        String content = "Failed to load data file";
        if (file.exists()) {
            try {
                content = Files.readString(this.urlData);
            } catch (Exception e) {
                content = String.format("Has been an error: %s", e.getMessage());
            }
        }

        return content;
    }
}