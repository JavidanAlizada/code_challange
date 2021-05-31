package main.creational.prototype.service.impl;

import main.creational.prototype.model.User;
import main.creational.prototype.service.Request;

public class UserRequest implements Request<User> {
    private User user;

    {
        user = new User(1, "JavidanAlizada");
    }

    public User getUser() {
        return user;
    }

    @Override
    public User sendRequest() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.getUser();
    }
}
