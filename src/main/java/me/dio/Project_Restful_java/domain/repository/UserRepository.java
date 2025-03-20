package me.dio.Project_Restful_java.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.Project_Restful_java.domain.model.User;


@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
    
}
