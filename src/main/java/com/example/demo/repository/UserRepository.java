package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select u From User u Where u.email = ?1")
    Optional<User> findUsersByEmail(String email);
    @Query(value = "SELECT m FROM User m WHERE m.uname LIKE %:title% OR m.email LIKE %:title% OR m.phone LIKE %:title% ")
    List<User> searchByTitleLike(@Param("title") String title);
}
