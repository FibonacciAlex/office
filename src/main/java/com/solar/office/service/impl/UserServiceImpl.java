package com.solar.office.service.impl;

import com.solar.office.bean.User;
import com.solar.office.dao.UserMapper;
import com.solar.office.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Alex
 * @date 2018/8/14 22:04
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;


    @Override
    public int insertByUser(User user) throws Exception {
        return userDao.insert(user);
    }

    @Override
    public User findById(long id) throws Exception {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public int update(User user) throws Exception {
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public int delete(long id) throws Exception {
        return userDao.deleteByPrimaryKey(id);
    }
}
