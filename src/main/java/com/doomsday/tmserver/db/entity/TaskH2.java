package com.doomsday.tmserver.db.entity;



import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name = "Task")
public class TaskH2 {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private LocalDateTime dateTime;
    @Column
    private String title;
    @Column
    private String context;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public TaskH2(){

    }

    public TaskH2(LocalDateTime dateTime, String title, String context, User user) {
        this.dateTime = dateTime;
        this.title = title;
        this.context = context;
        this.user = user;
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
