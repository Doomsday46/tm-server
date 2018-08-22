package com.doomsday.tmserver.db.repository;

import com.doomsday.tmserver.db.entity.TaskH2;
import com.doomsday.tmserver.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskHibernateRepository extends JpaRepository<TaskH2, Long> {
    @Query("select user from User user where user.login = :login")
    User findByName(@Param("login") String login);
    @Query("select task from TaskH2 task where task.user = :user")
    List<TaskH2> findAllTask(@Param("user") User user);
}
