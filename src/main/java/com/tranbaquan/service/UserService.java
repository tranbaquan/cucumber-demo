package com.tranbaquan.service;

import com.tranbaquan.model.MasterData;
import com.tranbaquan.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean authorizeUser(User user) {
        MasterData database = MasterData.getInstance();
        User found = database.findUser(user);

        return found != null;
    }
}
