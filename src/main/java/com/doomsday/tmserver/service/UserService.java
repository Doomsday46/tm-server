package com.doomsday.tmserver.service;

import com.doomsday.tmserver.model.User;
import com.doomsday.tmserver.model.UserInfo;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void addAllUsers(List<User> user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    List<UserInfo> getAllUsersInfo();
}
