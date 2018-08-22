package com.doomsday.tmserver.rest;

import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;
import com.doomsday.tmserver.model.User;
import com.doomsday.tmserver.service.TaskHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskHibernateService taskHibernateService;

    @RequestMapping(method = RequestMethod.PUT)
    public void addTask(@RequestBody InputObject inputObject){
        taskHibernateService.addTask(inputObject);
    }

    @RequestMapping(value = "/getAllTasks}", method = RequestMethod.GET)
    public List<Task> getTasks(@RequestBody User user){
        return  taskHibernateService.getAllTask(user);
    }
}
