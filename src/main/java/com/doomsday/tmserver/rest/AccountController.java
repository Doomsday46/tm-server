package com.doomsday.tmserver.rest;

import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.service.AccountHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountHibernateService accountHibernateService;

    @RequestMapping(value = "/new", method = RequestMethod.PUT)
    public void addAccount(@RequestBody Account account){
        accountHibernateService.addAccount(account);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public void deleteAccount(@RequestBody Account account){
        accountHibernateService.deleteAccount(account.getLogin());
    }

}
