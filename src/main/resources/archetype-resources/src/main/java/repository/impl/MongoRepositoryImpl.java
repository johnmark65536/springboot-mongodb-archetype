package ${package}.repository.impl;

import java.util.Optional;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import ${package}.model.User;

public interface MongoRepositoryImpl extends MongoRepository<User, String> {

    @Query("{id:?0}")
    Optional<User> findById(long id);

    @Query("{userName:'?0'}")
    Optional<User> findByUsername(String username);

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<User> findAll(String category);
    
    public long count();
} 