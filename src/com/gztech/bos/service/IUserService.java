package com.gztech.bos.service;

import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.User;
import com.gztech.bos.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    //特有的业务方法
    public User findByTel(String tel);

    public User login(String username, String password);

    public void modifyPassword(String newPwd, String userId);

    public void save(User model, String[] roleIds);

    public void pageQuery(PageBean<User> pb);
}
