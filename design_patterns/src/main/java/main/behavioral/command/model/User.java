package main.behavioral.command.model;

public class User {

    private UserDetail userDetail;
    private Address address;

    public User(UserDetail userDetail, Address address) {
        this.userDetail = userDetail;
        this.address = address;
    }
}
