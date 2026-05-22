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
 * Last Modified: Friday, 22nd May 2026 1:43:55 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql.controllers;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import nosql.utils.FileUtils;

public class UserController implements CrudHandler {
    private String fileDataName;
    private String dataFile;

    public UserController() {
        this.fileDataName = "users.json";
        this.dataFile = this.getContentData();
    }

    private final String getContentData() {
        return FileUtils.readFileData(this.fileDataName);
    }

    @Override
    public void create(Context arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void delete(Context arg0, String arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void getAll(Context ctx) {
        ctx.json(this.dataFile);
    }

    @Override
    public void getOne(Context arg0, String arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public void update(Context arg0, String arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}