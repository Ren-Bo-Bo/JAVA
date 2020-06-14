package com.qf.market.service;

import com.qf.market.entity.Tuser;

/**
 *用户业务接口
 *@author sx
 * @version 1.0 2020-04-07
 */
public interface ItuserService {
    /**
    *登录功能
    *@param u1
    *@return com.qf.market.entity.Tuser
    */
    Tuser login(Tuser u1);

    int updatePassword(String newPwd, String uaccount);
}
