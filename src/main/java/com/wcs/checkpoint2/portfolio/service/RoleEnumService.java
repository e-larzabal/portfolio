package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.model.RoleEnum;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleEnumService {

    public List<RoleEnum> list() {
        List<RoleEnum> roleEnums = new ArrayList<>();
        roleEnums.add(RoleEnum.ADMIN);
        roleEnums.add(RoleEnum.USER);
        return roleEnums;
    }
}
