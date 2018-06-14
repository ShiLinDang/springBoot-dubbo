package com.java4all.api;

import com.java4all.entity.User;

public interface UserService {

   /**
    * 根据电话查询用户
    * @param mobile
    * @return
    */
   User findByMobile(String mobile);
}
