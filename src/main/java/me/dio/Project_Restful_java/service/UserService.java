package me.dio.Project_Restful_java.service;

import me.dio.Project_Restful_java.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
