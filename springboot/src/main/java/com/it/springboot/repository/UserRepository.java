package com.it.springboot.repository;

import com.it.springboot.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //spring的bean
public interface UserRepository extends CrudRepository<User, Integer> {
}
