package com.websystique.springboot.repository;

import com.websystique.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by E065496 on 11/2/2018.
 */
public interface UserRepository extends JpaRepository<User, Integer>{

    User findById(long id);

    User findByName(String name);

}
