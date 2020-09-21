package com.wcs.checkpoint2.portfolio.repository;

import com.wcs.checkpoint2.portfolio.model.PortfolioUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PortfolioUserRepository extends JpaRepository<PortfolioUser, UUID> {

//    @Query(" select u from User u " +
//            " where u.username = ?1")
//    Optional<User> findUserWithName(String username);

    PortfolioUser findByUsername(String username);

}

