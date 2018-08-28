package com.doomsday.tmserver.service;

import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;

import java.util.List;

public interface TaskService {

    void addTask(InputObject inputObject);
    void addAllTask(List<Task> task, Account account);
    void deleteTask(Long id);
    List<Task> getAllTask(Account account);

}
