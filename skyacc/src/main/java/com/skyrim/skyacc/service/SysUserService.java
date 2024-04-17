package com.skyrim.skyacc.service;

import com.skyrim.skyacc.model.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SysUserService {

    /**
     * 返回所有用户
     * @return
     */
    List<SysUser> findAll();
}
