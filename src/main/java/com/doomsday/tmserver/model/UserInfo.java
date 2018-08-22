package com.doomsday.tmserver.model;

public class UserInfo {

    private User user;
    private Long id;

    public UserInfo(User user, Long id) {
        this.user = user;
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }
}
