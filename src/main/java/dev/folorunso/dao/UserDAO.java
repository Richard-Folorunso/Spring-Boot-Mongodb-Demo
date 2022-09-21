package dev.folorunso.dao;

import dev.folorunso.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserDAO extends MongoRepository<User, String> {

    @Query(value="{data:'?0'}", fields="{'id' : 1}")
    List<User> findAll(String data);
}
