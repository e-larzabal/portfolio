package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.RoleDao;
import com.wcs.checkpoint2.portfolio.dao.UserDao;
import com.wcs.checkpoint2.portfolio.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserService extends AbstractBaseService<User>{

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public BaseDao<User> getDao() {
        return userDao;
    }

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User create(User model) {
        model.setPassword(getPasswordEncode(model.getPassword()));

        return super.create(model);
    }

    @Override
    public User update(User model) {
        model.setEnabled(true);
        model.setAccountNonExpired(true);
        model.setCredentialsNonExpired(true);
        model.setAccountNonLocked(true);

        model.setPassword(getPasswordEncode(model.getPassword()));

        return super.update(model);
    }

    private String getPasswordEncode(String password){
        return passwordEncoder.encode(password);
    }
}

