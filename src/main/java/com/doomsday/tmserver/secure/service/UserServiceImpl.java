package com.doomsday.tmserver.secure.service;

import com.doomsday.tmserver.db.repository.UserHibernateRepository;
import com.doomsday.tmserver.db.entity.secure.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserHibernateRepository userHibernateRepository;

    @Override
    public User getUser(String login) {
        User userdb = userHibernateRepository.findByUsername(login);
        return userdb;
    }

    @Override
    public Boolean containsUser(String login) {
        User userdb = userHibernateRepository.findByUsername(login);
        return userdb != null;
    }

}