package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.UserDao;
import com.wcs.checkpoint2.portfolio.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

//@Service
//public class UserService implements UserDetailsService {
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Objects.requireNonNull(username);
//        User user = userRepository.findUserWithName(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        return user;
//    }
//}

@Service
public class UserService extends AbstractBaseService<User>{

    @Autowired
    private UserDao userDao;

    @Override
    public BaseDao<User> getDao() { return userDao; }
}

