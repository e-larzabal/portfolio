package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.TokenDao;
import com.wcs.checkpoint2.portfolio.model.Skill;
import com.wcs.checkpoint2.portfolio.model.Token;
import com.wcs.checkpoint2.portfolio.model.Tool;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenService extends AbstractBaseService<Token> {

    @Autowired
    private TokenDao tokenDao;

    @Override
    public BaseDao<Token> getDao() { return tokenDao; }
}
