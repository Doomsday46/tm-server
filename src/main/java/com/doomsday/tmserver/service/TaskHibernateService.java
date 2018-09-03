package com.doomsday.tmserver.service;

import com.doomsday.tmserver.db.entity.TaskH2;
import com.doomsday.tmserver.db.entity.secure.User;
import com.doomsday.tmserver.db.repository.TaskHibernateRepository;
import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.model.InputObject;
import com.doomsday.tmserver.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@ComponentScan("com.doomsday.tmserver")
public class TaskHibernateService implements TaskService {

    @Autowired
    private TaskHibernateRepository taskHibernateRepository;

    @Autowired
    private AccountHibernateService accountHibernateService;

    @Override
    @Transactional
    @PreAuthorize("hasAuthority('USER')")
    public void addTask(InputObject inputObject) {
        User user = AccountToUser(accountHibernateService.getAccount(inputObject.getLogin()));
        taskHibernateRepository.save(new TaskH2(inputObject.getDateTimeTask(),inputObject.getDateOfCompletion(),inputObject.getContext(),user));
    }

    @Override
    @Transactional
    @PreAuthorize("hasAuthority('USER')")
    public void addAllTask(List<Task> task, Account account) {

    }

    @Override
    @Transactional
    @PreAuthorize("hasAuthority('USER')")
    public void deleteTask(Long id) {
        taskHibernateRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    @PreAuthorize("hasAuthority('USER')")
    public List<Task> getAllTask(Account account) {
        List<TaskH2> taskH2List = taskHibernateRepository.findAllByUser(AccountToUser(account));
        List<Task> taskList = new ArrayList<>();
        for (TaskH2 task:taskH2List) {
            taskList.add(new Task(task.getDateTime(),task.getDateEnd(),task.getContext()));
        }
        return taskList;
    }

    private User AccountToUser(Account account){
        User user = new User();
        user.setUsername(account.getLogin());
        user.setPassword(account.getPassword());
        return user;
    }
}
