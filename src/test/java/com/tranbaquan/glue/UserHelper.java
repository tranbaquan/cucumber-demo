package com.tranbaquan.glue;

import com.tranbaquan.model.User;
import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class UserHelper {
    private User user;
    private boolean isAuthorized;

    public void init() {
        this.user = new User();
    }

    public void setUserName(String username) {
        this.user.setUsername(username);
    }

    public void setPassword(String password) {
        this.user.setPassword(password);
    }

    public User getUser() {
        return user;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
