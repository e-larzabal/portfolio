package com.wcs.checkpoint2.portfolio.service;


import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.ContactDao;
import com.wcs.checkpoint2.portfolio.dao.LanguageDao;
import com.wcs.checkpoint2.portfolio.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService extends AbstractBaseService<Language> {

    @Autowired
    private LanguageDao languageDao;

    @Override
    public BaseDao<Language> getDao() {
        return null;
    }
}


