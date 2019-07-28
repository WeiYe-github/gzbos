package com.gztech.bos.dao;

import com.gztech.bos.dao.base.IBaseDao;
import com.gztech.bos.model.User;

public interface IUserDao extends IBaseDao<User> {

    public User findByEmail(String email);

    public User find(String username, String password);

    public User findByUsername(String username);
}
