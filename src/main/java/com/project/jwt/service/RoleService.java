package com.project.jwt.service;

import com.project.jwt.dao.RoleDao;
import com.project.jwt.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleService {

    @Autowired
    private RoleDao roleDao;
    public Role createNew(Role role){
        return roleDao.save(role);
    }
}
