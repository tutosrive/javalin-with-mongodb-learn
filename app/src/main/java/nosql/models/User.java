/*
 * models - Just test-learn with javalin and in future with MongoDB
 * Copyright 2026 - 2026 tutosrive
 * Licence: GPL-3
 * More information: https://github.com/tutosrive/javalin-with-mongodb-learn/blob/main/LICENSE
 * Author: tutosrive (tutosrive@Dev2Forge.software)
 * 
 * File: \User.java
 * Created: Saturday, 23rd May 2026 8:59:57 am
 * -----
 * Last Modified: Saturday, 23rd May 2026 7:55:12 pm
 * Modified By: tutosrive (tutosrive@Dev2Forge.software)
 * -----
 */

package nosql.models;

public class User {
    private String name;
    private String lastname;
    private int age;
    private String email;

    public User(String name, String lastn, int age, String email) {
        this.name = name;
        this.age = age;
        this.lastname = lastn;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "{\"name\": %s, \"lastname\": %s, \"email\": %s, \"age\": %d}",
                this.name, this.lastname, this.email, this.age);
    }
}