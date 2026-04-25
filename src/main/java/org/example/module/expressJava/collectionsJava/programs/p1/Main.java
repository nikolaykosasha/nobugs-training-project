package org.example.module.expressJava.collectionsJava.programs.p1;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(123, "lomaxa");
        User user2 = new User(323, "bibaBoba");
        User user3 = new User(455, "lolaGoodBye");

        Users usersList = new Users();

        usersList.addUser(user1);
        usersList.addUser(user2);
        usersList.addUser(user3);
        usersList.addUser(666, "hopLa");

        System.out.println(usersList.containsUser(666));
    }
}
