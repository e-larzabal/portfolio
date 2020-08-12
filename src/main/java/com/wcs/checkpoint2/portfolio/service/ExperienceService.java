package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;

import com.wcs.checkpoint2.portfolio.dao.ExperienceDao;
import com.wcs.checkpoint2.portfolio.model.Experience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService extends AbstractBaseService<Experience> {

    @Autowired
    private ExperienceDao experienceDao;

    @Override
    public BaseDao<Experience> getDao() {
        return experienceDao;
    }
}
