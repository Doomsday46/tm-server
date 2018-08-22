package com.doomsday.tmserver.service;

import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;
import com.doomsday.tmserver.model.User;

import java.util.List;

public interface TaskService {

    void addTask(InputObject inputObject);
    void addAllTask(List<Task> task, User user);
    void deleteTask(Long id);
    List<Task> getAllTask(User user);

}
