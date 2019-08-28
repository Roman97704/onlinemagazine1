package com.roman.onlinemagazine.repository;


import com.roman.onlinemagazine.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{

   Optional<User> findUserByUsername(String username);
    void deleteUserByUsername(String username);
    boolean existsUserByUsernameOrEmail(String username, String email);
}
