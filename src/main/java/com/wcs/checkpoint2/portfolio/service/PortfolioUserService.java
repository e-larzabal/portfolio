package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.UserDao;
import com.wcs.checkpoint2.portfolio.model.PortfolioUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PortfolioUserService extends AbstractBaseService<PortfolioUser>{

    @Autowired
    private UserDao userDao;

    @Override
    public BaseDao<PortfolioUser> getDao() { return userDao; }
}

