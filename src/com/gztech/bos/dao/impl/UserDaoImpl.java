package com.gztech.bos.dao.impl;

import com.gztech.bos.dao.IUserDao;
import com.gztech.bos.dao.base.BaseDaoImpl;
import com.gztech.bos.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao {
    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User find(String username, String password) {

        String hql = "FROM User WHERE username = ? AND password = ?";
        List<User> list = hibernateTemplate.find(hql, username, password);

        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        String hql = "FROM User WHERE username = ?";
        List<User> list = hibernateTemplate.find(hql, username);

        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
}
