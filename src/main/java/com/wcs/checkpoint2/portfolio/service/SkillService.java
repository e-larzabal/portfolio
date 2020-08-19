package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.SkillDao;
import com.wcs.checkpoint2.portfolio.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillService extends AbstractBaseService<Skill>{

    @Autowired
    private SkillDao skillDao;

    @Override
    public BaseDao<Skill> getDao() { return skillDao; }
}
