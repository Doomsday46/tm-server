package com.doomsday.tmserver.service;

import com.doomsday.tmserver.db.repository.TaskMongoRepository;
import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;
import com.doomsday.tmserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskMongoService implements TaskService {

    @Autowired
    private TaskMongoRepository taskRepository;


    @Override
    public void addTask(InputObject inputObject) {

    }

    @Override
    public void addAllTask(List<Task> task,User user) {

    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public List<Task> getAllTask(User user) {
        return null;
    }
}
