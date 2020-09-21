package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.UserDao;
import com.wcs.checkpoint2.portfolio.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService extends AbstractBaseService<User>{

    @Autowired
    private UserDao userDao;

    @Override
    public BaseDao<User> getDao() {
        return userDao;
    }

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User create(User model) {
        model.setAccountNonExpired(true);
        model.setAccountNonLocked(true);
        model.setCredentialsNonExpired(true);
        model.setEnabled(true);
        model.setPassword(passwordEncoder.encode(model.getPassword()));
        return super.create(model);
    }

    @Override
    public User update(User model) {
        model.setPassword(passwordEncoder.encode(model.getPassword()));
        return super.update(model);
    }
}

