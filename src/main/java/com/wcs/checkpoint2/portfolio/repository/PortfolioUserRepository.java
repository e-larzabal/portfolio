package com.wcs.checkpoint2.portfolio.repository;

import com.wcs.checkpoint2.portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PortfolioUserRepository extends JpaRepository<User, UUID> {

    default User findByUsername(String username) {
        return null;
    }

}

