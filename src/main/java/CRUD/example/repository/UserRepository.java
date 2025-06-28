package CRUD.example.users.repository;

import  CRUD.example.users.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Inherits save(), findById(), deleteById(), findAll(), etc.
}