package com.doomsday.tmserver.service;

import com.doomsday.tmserver.db.entity.secure.User;
import com.doomsday.tmserver.db.repository.UserHibernateRepository;
import com.doomsday.tmserver.model.Account;
import com.doomsday.tmserver.model.UserInfo;
import com.doomsday.tmserver.secure.encryption.Encoders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AccountHibernateService implements AccountService {

    @Autowired
    private Encoders encoders;

    @Autowired
    private UserHibernateRepository userHibernateRepository;

    @Override
    public void addAccount(Account account) {
        User user = new User();
        user.setUsername(account.getLogin());
        String encodePassword = encoders.userPasswordEncoder().encode(account.getPassword());
        if(encoders.userPasswordEncoder().matches(account.getPassword(),encodePassword)) {
            user.setPassword(encodePassword);
            user.setAccountExpired(false);
            user.setAccountLocked(false);
            user.setCredentialsExpired(false);
        }
        else throw new NullPointerException();
        userHibernateRepository.save(user);
    }

    @Override
    public void addAllAccount(List<Account> account) {

    }

    @Override
    public void deleteAccount(String login) {
        User user = userHibernateRepository.findByUsername(login);
        userHibernateRepository.delete(user);
    }

    @Override
    public Account getAccount(Long id) {
        Optional<User> user = userHibernateRepository.findById(id);
        return new Account(user.get().getUsername(),user.get().getPassword());
    }

    @Override
    public Account getAccount(String login) {
        User user = userHibernateRepository.findByUsername(login);
        return new Account(user.getUsername(),user.getPassword());
    }

    @Override
    public List<Account> getAllAccount() {
        List<User> users = userHibernateRepository.findAll();
        return fillAccountList(users);
    }

    @Override
    public List<UserInfo> getAllUsersInfo() {
        List<User> users = userHibernateRepository.findAll();
        List<Account> accountList = fillAccountList(users);
        return fillUserInfoList(users,accountList);
    }

    private List<UserInfo> fillUserInfoList(List<User> users,List<Account> accounts){
        List<UserInfo> userInfoList = new ArrayList<>();
        for(int i = 0; i < users.size();i++){
            userInfoList.add(new UserInfo(accounts.get(i),users.get(i).getId()));
        }
        return userInfoList;
    }

    private List<Account> fillAccountList(List<User> users){
        List<Account> accountList = new ArrayList<>();
        for (User user:users) {
            accountList.add(new Account(user.getUsername(),user.getPassword()));
        }
        return accountList;
    }
}
