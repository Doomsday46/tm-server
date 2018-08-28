package com.doomsday.tmserver.db.repository;

import com.doomsday.tmserver.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserHibernateRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
