package com.gztech.bos.service.impl;

import com.gztech.bos.dao.IDecidedzoneDao;
import com.gztech.bos.dao.ISubareaDao;
import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.Function;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Subarea;
import com.gztech.bos.service.IDecidedzoneService;
import com.gztech.bos.service.IFunctionService;
import com.gztech.bos.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional//事务是由事务管理器来实现
public class FunctionServiceImpl extends BaseServiceImpl<Function> implements IFunctionService {


    @Override
    public void pageQuery(PageBean<Function> pb) {

        functionDao.pageQuery(pb);
    }

    @Override
    public List<Function> findMenuByUserId(String id) {
        return functionDao.findMenuByUserId(id);
    }

    @Override
    public List<Function> findAllMenu() {
        return functionDao.findAllMenu();
    }

    @Override
    public void save(Function entity) {
        functionDao.save(entity);
    }

    @Override
    public void delete(Function entity) {

    }

    @Override
    public void update(Function entity) {

    }

    @Override
    public Function find(Serializable id) {
        return null;
    }

    @Override
    public List<Function> findAll() {
        return functionDao.findAll();
    }
}
