package com.doomsday.tmserver.model;

import java.time.LocalDateTime;

public class InputObject {

    private String login;

    private LocalDateTime dateTimeTask;
    private LocalDateTime dateOfCompletion;
    private String context;

    public InputObject(String login, LocalDateTime dateTime, LocalDateTime dateOfCompletion, String context) {
        this.login = login;
        this.dateTimeTask = dateTime;
        this.dateOfCompletion = dateOfCompletion;
        this.context = context;
    }

    public String getLogin() {
        return login;
    }

    public LocalDateTime getDateTimeTask() {
        return dateTimeTask;
    }

    public LocalDateTime getDateOfCompletion() {
        return dateOfCompletion;
    }

    public String getContext() {
        return context;
    }
}
