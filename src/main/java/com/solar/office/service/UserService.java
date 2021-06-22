package com.solar.office.service;

import com.solar.office.bean.User;

/**
 * @author Alex
 * @date 2018/8/14 22:04
 **/
public interface UserService {


    int insertByUser(User user) throws Exception;

    User findById(long id) throws Exception;

    int update(User user) throws Exception;

    int delete(long id) throws Exception;
}
