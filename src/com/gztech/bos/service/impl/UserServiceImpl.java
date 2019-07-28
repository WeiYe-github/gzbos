package com.gztech.bos.service.impl;

import com.gztech.bos.dao.IUserDao;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Role;
import com.gztech.bos.model.User;
import com.gztech.bos.service.IUserService;
import com.gztech.bos.service.base.BaseServiceImpl;
import com.gztech.bos.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional//事务是由事务管理器来实现
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User findByTel(String tel) {
        return null;
    }

    @Override
    public User login(String username, String password) {
        return userDao.find(username, MD5Utils.text2md5(password));
    }

    @Override
    public void modifyPassword(String newPwd, String userId) {
        /*String hql = "UPDATE User SET password=? WHERE id = ?";
        userDao.executeUpdate(hql,MD5Utils.text2md5(newPwd),userId);*/

        userDao.executeUpdateByQueryName("updatePwd", MD5Utils.text2md5(newPwd), userId);
    }

    @Override
    public void save(User model, String[] roleIds) {

        userDao.save(model);

        for (String roleId : roleIds) {
            Role role = new Role();
            role.setId(roleId);
            model.getRoles().add(role);
        }

    }

    @Override
    public void pageQuery(PageBean<User> pb) {
        userDao.pageQuery(pb);
    }

    @Override
    public void save(User entity) {

        userDao.save(entity);
    }

    @Override
    public void delete(User entity) {
        userDao.delete(entity);
    }

    @Override
    public void update(User entity) {
        userDao.update(entity);
    }

    @Override
    public User find(Serializable id) {
        return userDao.find(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
