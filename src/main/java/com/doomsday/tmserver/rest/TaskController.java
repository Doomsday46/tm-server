package com.doomsday.tmserver.rest;

import com.doomsday.tmserver.db.entity.TaskMongo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {




    @RequestMapping(method = RequestMethod.PUT)
    public void addTask(@RequestBody TaskMongo taskMongo){

    }

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public List<TaskMongo> getTasks(@PathVariable String user){
        return  null;
    }
}
