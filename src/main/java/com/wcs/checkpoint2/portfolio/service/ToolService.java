package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.dao.BaseDao;
import com.wcs.checkpoint2.portfolio.dao.ToolDao;
import com.wcs.checkpoint2.portfolio.model.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ToolService extends AbstractBaseService<Tool>{

    @Autowired
    private ToolDao toolDao;

    @Override
    public BaseDao<Tool> getDao() { return toolDao; }
}
