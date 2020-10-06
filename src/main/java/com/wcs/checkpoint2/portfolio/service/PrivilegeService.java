package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.PrivilegeDao;
import com.wcs.checkpoint2.portfolio.model.Privilege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeService extends AbstractBaseService<Privilege>{
    @Autowired
    private PrivilegeDao privilegeDao;

    @Override
    public BaseDao<Privilege> getDao() { return privilegeDao; }

}
