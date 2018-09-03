package com.doomsday.tmserver.rest;

import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.service.AccountHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountHibernateService accountHibernateService;

    @RequestMapping(value = "/sign-up", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void signUp(@RequestBody Account account){
        accountHibernateService.addAccount(account);
    }

}
