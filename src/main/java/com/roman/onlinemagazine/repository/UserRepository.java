package com.roman.onlinemagazine.repository;

import com.roman.onlinemagazine.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
