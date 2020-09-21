package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.model.PortfolioUser;
import com.wcs.checkpoint2.portfolio.repository.PortfolioUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private PortfolioUserRepository portfolioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final PortfolioUser portfolioUser = portfolioRepository.findByUsername(username);
        if (portfolioUser == null) {
            throw new UsernameNotFoundException(username);
        }

        UserDetails user = User.withUsername(portfolioUser.getEmail()).password(portfolioUser.getPassword()).authorities("USER").build();
        return user;
    }
}
