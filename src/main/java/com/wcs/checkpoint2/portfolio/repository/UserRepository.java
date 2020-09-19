package com.wcs.checkpoint2.portfolio.repository;

import com.wcs.checkpoint2.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

//    @Query(" select u from User u " +
//            " where u.username = ?1")
//    Optional<User> findUserWithName(String username);

}

