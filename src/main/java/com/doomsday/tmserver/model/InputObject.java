package com.doomsday.tmserver.model;

import java.time.LocalDateTime;

public class InputObject {

    private String login;

    private LocalDateTime dateTime;
    private String title;
    private String context;

    public InputObject(String login, LocalDateTime dateTime, String title, String context) {
        this.login = login;
        this.dateTime = dateTime;
        this.title = title;
        this.context = context;
    }

    public String getLogin() {
        return login;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getTitle() {
        return title;
    }

    public String getContext() {
        return context;
    }
}
