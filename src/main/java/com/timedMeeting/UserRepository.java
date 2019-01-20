package com.timedMeeting;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adhocmaster.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}