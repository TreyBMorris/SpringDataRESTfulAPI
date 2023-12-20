package com.example.springapi.repository;

import com.example.springapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String>
{
    @Query("{'firstName': ?0}")
    Optional<User> findByName(String firstName);

}
