package com.doomsday.tmserver.rest;

import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;
import com.doomsday.tmserver.service.TaskHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secure/task")
public class TaskController {

    @Autowired
    private TaskHibernateService taskHibernateService;

    @RequestMapping(value = "/add" ,method = RequestMethod.PUT)
    public void addTask(@RequestBody InputObject inputObject){
        taskHibernateService.addTask(inputObject);
    }

    @RequestMapping(value = "/delete/task/{id}")
    public void deleteTask(@RequestBody Account account, @PathVariable Long id){
        taskHibernateService.deleteTask(id);
    }


    @RequestMapping(value = "/getAllTasks", method = RequestMethod.GET)
    public List<Task> getTasks(@RequestBody Account account){
        return  taskHibernateService.getAllTask(account);
    }
}
