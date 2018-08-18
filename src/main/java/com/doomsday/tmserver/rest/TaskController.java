package com.doomsday.tmserver.rest;

import com.doomsday.tmserver.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.PUT)
    public void addTask(@RequestBody Task task){

    }

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public List<Task> getTasks(@PathVariable String user){
        return  null;
    }
}
