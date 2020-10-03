package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.UserDao;
import com.wcs.checkpoint2.portfolio.model.User;
import com.wcs.checkpoint2.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;


@Service
public class UserService extends AbstractBaseService<User> implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public BaseDao<User> getDao() {
        return userDao;
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        User user = userRepository.findByUsername(username);
        if (user.getUuid() == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        return user;
    }

    @Override
    public User create(User user) {
        // Encoding password
        String encodedPassword = getEncodedPassword(user.getPassword());
        user.setPassword(encodedPassword);

        return super.create(user);
    }

    @Override
    public User update(User user) {
        // Encoding password
        String passwordEncoded = getEncodedPassword(user.getPassword());
        user.setPassword(passwordEncoded);

        return super.update(user);
    }

    private String getEncodedPassword(String password){
        String encodedPassword = password;
        Boolean isEncoded = true;
        if (password.length() != 60) isEncoded = false;
        if (isEncoded){
            if (!password.substring(0,4).equals("$2a$")) isEncoded = false;
        };
        if (isEncoded){
            if (!password.substring(3,7).equals("$10$")) isEncoded = false;
        }

        if (!isEncoded){
            encodedPassword = passwordEncoder.encode(password);
        }

        return encodedPassword;
    }


  /*  private boolean deleteAllRolesOfTheUser(UUID user_uuid){

        return true;
    }*/
}

