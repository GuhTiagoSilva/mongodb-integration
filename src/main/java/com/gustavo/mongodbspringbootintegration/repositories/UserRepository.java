package com.gustavo.mongodbspringbootintegration.repositories;

import com.gustavo.mongodbspringbootintegration.models.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
