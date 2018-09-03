package com.doomsday.tmserver.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Task {
    private LocalDateTime dateTime;
    private LocalDateTime dateEnd;
    private String context;


    public Task(){

    }

    public Task(LocalDateTime dateTime, LocalDateTime dateEnd, String context) {
        this.dateTime = dateTime;
        this.dateEnd = dateEnd;
        this.context = context;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
