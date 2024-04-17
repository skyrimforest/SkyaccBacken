package com.skyrim.skyacc.service.impl;


import com.skyrim.skyacc.dao.SysUserMapper;
import com.skyrim.skyacc.model.SysUser;
import com.skyrim.skyacc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser>findAll(){
        return sysUserMapper.findAll();
    }
}
