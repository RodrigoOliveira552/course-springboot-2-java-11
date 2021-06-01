package com.starkweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starkweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
