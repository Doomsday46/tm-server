package com.doomsday.tmserver.secure.service;

import com.doomsday.tmserver.db.repository.UserHibernateRepository;
import com.doomsday.tmserver.secure.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserHibernateRepository userHibernateRepository;

    @Override
    public User getUser(String login) {
        com.doomsday.tmserver.db.entity.User userdb = userHibernateRepository.findByLogin(login);
        return new User(userdb.getLogin(),userdb.getPassword());
    }

    @Override
    public Boolean containsUser(String login) {
        com.doomsday.tmserver.db.entity.User userdb = userHibernateRepository.findByLogin(login);
        return userdb != null;
    }

}