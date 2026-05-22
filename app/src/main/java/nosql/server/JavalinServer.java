/*
 * server - Just test-learn with javalin and in future with MongoDB
 * Copyright 2026 - 2026 tutosrive
 * Licence: GPL-3
 * More information: https://github.com/tutosrive/javalin-with-mongodb-learn/blob/main/LICENSE
 * Author: tutosrive (tutosrive@Dev2Forge.software)
 * 
 * File: \JavalinServer.java
 * Created: Thursday, 21st May 2026 8:22:27 pm
 * -----
 * Last Modified: Friday, 22nd May 2026 1:42:03 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql.server;

import io.javalin.Javalin;
import io.javalin.apibuilder.ApiBuilder;
import nosql.controllers.UserController;

public class JavalinServer {
    public Javalin app;

    public JavalinServer() {
        this(7070);
    }

    public JavalinServer(int port) {
        // UserController userCtrl = new UserController();
        this.app = Javalin.create(config -> {
            config.bundledPlugins.enableCors(cors -> {
                cors.addRule(it -> {
                    it.anyHost();
                });
            });

            config.routes.apiBuilder(
                    () -> {
                        ApiBuilder.crud("users/{user-id}", new UserController());
                    });
            // config.routes.get("/user", ctx -> ctx.json(userCtrl.getAllUsers(ctx)));
        }).start(port);
    }
}