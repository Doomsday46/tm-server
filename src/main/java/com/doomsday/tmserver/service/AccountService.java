package com.doomsday.tmserver.service;

import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.model.UserInfo;

import java.util.List;

public interface AccountService {

    void addAccount(Account account);
    void addAllAccount(List<Account> account);
    void deleteAccount(String login);
    Account getAccount(Long id);
    Account getAccount(String login);
    List<Account> getAllAccount();
    List<UserInfo> getAllUsersInfo();
}
