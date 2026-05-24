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
 * Last Modified: Saturday, 23rd May 2026 8:09:52 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql.controllers;

import io.javalin.apibuilder.CrudHandler;
import io.javalin.http.Context;
import nosql.utils.FileUtils;

public class UserController implements CrudHandler {
    private String fileDataName;
    private String fileDateConetent;

    public UserController() {
        this.fileDataName = "users.json";
        this.getContentData();
    }

    private final void getContentData() {
        this.fileDateConetent = FileUtils.readFileData(this.fileDataName);
    }

    @Override
    public void create(Context ctx) {
        String body = ctx.body();
        FileUtils.saveFileToData(this.fileDataName, body.toString());
        ctx.status(201);
    }

    @Override
    public void delete(Context arg0, String arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void getAll(Context ctx) {
        ctx.json(this.fileDateConetent);
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