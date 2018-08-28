package com.doomsday.tmserver.model;

public class UserInfo {

    private Account account;
    private Long id;

    public UserInfo(Account account, Long id) {
        this.account = account;
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }
}
