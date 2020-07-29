package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.FormationDao;
import com.wcs.checkpoint2.portfolio.model.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormationService extends AbstractBaseService<Formation> {

    @Autowired
    private FormationDao formationDao;

    @Override
    public BaseDao<Formation> getDao() {
        return null;
    }
}
