package com.doomsday.tmserver.db.repository;

import com.doomsday.tmserver.db.entity.TaskH2;
import com.doomsday.tmserver.db.entity.secure.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskHibernateRepository extends JpaRepository<TaskH2, Long> {
    List<TaskH2> findAllByUser(User user);
}
