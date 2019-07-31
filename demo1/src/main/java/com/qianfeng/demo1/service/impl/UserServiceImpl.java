package com.qianfeng.demo1.service.impl;

import com.qianfeng.demo1.entity.TUser;
import com.qianfeng.demo1.mapper.TUserMapper;
import com.qianfeng.demo1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author henggege
 * @Date 2019/7/30 0030
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
