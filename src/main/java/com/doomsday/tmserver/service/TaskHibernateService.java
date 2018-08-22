package com.doomsday.tmserver.service;

import com.doomsday.tmserver.db.entity.TaskH2;
import com.doomsday.tmserver.db.repository.TaskHibernateRepository;
import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;
import com.doomsday.tmserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TaskHibernateService implements TaskService {

    @Autowired
    private TaskHibernateRepository taskHibernateRepository;

    @Override
    public void addTask(InputObject inputObject) {
         taskHibernateRepository.save(new TaskH2(inputObject.getDateTime(),inputObject.getTitle(),inputObject.getContext(),
                                                 taskHibernateRepository.findByName(inputObject.getLogin())));
    }

    @Override
    public void addAllTask(List<Task> task,User user) {

    }

    @Override
    public void deleteTask(Long id) {
        taskHibernateRepository.deleteById(id);
    }

    @Override
    public List<Task> getAllTask(User user) {
        List<TaskH2> taskH2List = taskHibernateRepository.findAllTask(new com.doomsday.tmserver.db.entity.User(user.getLogin()));
        List<Task> taskList = new ArrayList<>();
        for (TaskH2 task:taskH2List) {
            taskList.add(new Task(task.getDateTime(),task.getTitle(),task.getContext()));
        }
        return taskList;
    }
}
