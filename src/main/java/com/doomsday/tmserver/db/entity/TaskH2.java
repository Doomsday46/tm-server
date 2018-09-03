package com.doomsday.tmserver.db.entity;



import com.doomsday.tmserver.db.entity.secure.User;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "Task")
public class TaskH2 {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "dateCreate")
    private LocalDateTime dateTime;
    @Column(name = "dateEnd")
    private LocalDateTime dateEnd;
    @Column
    private String context;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public TaskH2(){

    }

    public TaskH2(LocalDateTime dateTime, LocalDateTime dateEnd, String context, User user) {
        this.dateTime = dateTime;
        this.dateEnd = dateEnd;
        this.context = context;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
