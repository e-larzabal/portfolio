package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.ProjectDao;
import com.wcs.checkpoint2.portfolio.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends AbstractBaseService<Project>{

    @Autowired
    private ProjectDao projectDao;

    @Override
    public BaseDao<Project> getDao() {
        return projectDao;
    }

}
