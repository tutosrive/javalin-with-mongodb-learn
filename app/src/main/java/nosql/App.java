/*
 * nosql - Just test-learn with javalin and in future with MongoDB
 * Copyright 2026 - 2026 tutosrive
 * Licence: GPL-3
 * More information: https://github.com/tutosrive/javalin-with-mongodb-learn/blob/main/LICENSE
 * Author: tutosrive (tutosrive@Dev2Forge.software)
 * 
 * File: \App.java
 * Created: Thursday, 21st May 2026 7:48:45 pm
 * -----
 * Last Modified: Saturday, 23rd May 2026 9:10:58 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;

// import nosql.server.JavalinServer;

public class App {
    public static void main(String[] args) {
        // new JavalinServer();
        String connectionString = "mongodb://localhost:27017/";

        try (MongoClient mgClient = MongoClients.create(connectionString)) {
            MongoDatabase db = mgClient.getDatabase("dbusertest");
            MongoCollection<Document> testCollection = db.getCollection("users");

            Document doc1 = testCollection.find(eq("email", "zachary.lo@example.com")).first();

            if (!doc1.isEmpty()) {
                System.out.println(doc1.toJson());
            } else {
                System.out.println("Don't match a document!");
            }
        }
    }
}
