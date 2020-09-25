package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.RoleDao;
import com.wcs.checkpoint2.portfolio.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractBaseService<Role>{
    @Autowired
    private RoleDao roleDao;

    @Override
    public BaseDao<Role> getDao() { return roleDao; }

}
