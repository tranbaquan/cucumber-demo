package com.tranbaquan.model;

import java.util.ArrayList;
import java.util.List;

public class MasterData {

    private static MasterData INSTANCE = new MasterData();
    private List<User> users;

    private MasterData() {
        users = new ArrayList<>();
        addMasterData();
    }

    private void addMasterData() {
        users.add(new User("tranbaquan", "123"));
        users.add(new User("user1", "123"));
        users.add(new User("user2", "123"));
        users.add(new User("user3", "123"));
        users.add(new User("user4", "123"));
        users.add(new User("user5", "123"));
        users.add(new User("user6", "123"));
        users.add(new User("user7", "123"));
        users.add(new User("user8", "123"));
        users.add(new User("user9", "123"));
    }

    public static MasterData getInstance() {
        if (INSTANCE == null) {
            return new MasterData();
        }
        return INSTANCE;
    }

    public User findUser(User user) {
        return this.users.stream().filter(u -> u.equals(user)).findFirst().orElse(null);
    }
}
