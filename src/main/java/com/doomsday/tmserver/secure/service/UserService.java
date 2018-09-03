package com.doomsday.tmserver.secure.service;

import com.doomsday.tmserver.db.entity.secure.User;

public interface UserService {
    User getUser(String login);
    Boolean containsUser(String login);
}
