package com.doomsday.tmserver.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Task {
    private LocalDateTime dateTime;
    private String title;
    private String context;


    public Task(){

    }

    public Task(LocalDateTime dateTime, String title, String context) {
        this.dateTime = dateTime;
        this.title = title;
        this.context = context;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
