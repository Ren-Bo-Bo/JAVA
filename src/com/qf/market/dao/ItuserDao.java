package com.qf.market.dao;

import com.qf.market.entity.Tuser;

/**
 *用户数据访问接口
 *@author sx
 * @version 1.0 2020-04-07
 */
public interface ItuserDao {
    /**
     *登录功能
     *@param u1
     *@return com.qf.market.entity.Tuser
     */
    Tuser queryUserByNameAndPwd(Tuser u1);

    int updatePassword(String newPwd, String uaccount);
}
