package org.example.expressJava.collectionsJava.programs.p1;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> userList;

    public Users() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void addUser(int id, String userName) {
        User user = new User(id, userName);
        userList.add(user);
    }

    public boolean containsUser(int id) {
        boolean result = false;
        for (User u : userList) {
            if (id == u.getId()) {
                result = true;
            }
        }
        return result;
    }
}
