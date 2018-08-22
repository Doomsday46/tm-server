package com.doomsday.tmserver.db.repository;

import com.doomsday.tmserver.db.entity.TaskMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskMongoRepository extends  MongoRepository<TaskMongo, String> {

}
