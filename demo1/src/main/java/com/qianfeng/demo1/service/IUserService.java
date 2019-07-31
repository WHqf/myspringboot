package com.qianfeng.demo1.service;

import com.qianfeng.demo1.entity.TUser;

/**
 * @Author henggege
 * @Date 2019/7/30 0030
 */
public interface IUserService {
    TUser selectByPrimaryKey(Integer id);
}
