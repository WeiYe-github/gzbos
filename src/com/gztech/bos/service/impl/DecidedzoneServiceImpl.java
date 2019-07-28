package com.gztech.bos.service.impl;

import com.gztech.bos.dao.IDecidedzoneDao;
import com.gztech.bos.dao.IRegionDao;
import com.gztech.bos.dao.ISubareaDao;
import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Region;
import com.gztech.bos.model.Subarea;
import com.gztech.bos.service.IDecidedzoneService;
import com.gztech.bos.service.IRegionService;
import com.gztech.bos.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional//事务是由事务管理器来实现
public class DecidedzoneServiceImpl extends BaseServiceImpl<Decidedzone> implements IDecidedzoneService {


    @Autowired
    private IDecidedzoneDao decidedzoneDao;
    @Autowired
    private ISubareaDao subareaDao;

    @Override
    public void save(Decidedzone entity) {

    }

    @Override
    public void delete(Decidedzone entity) {

    }

    @Override
    public void update(Decidedzone entity) {

    }

    @Override
    public Decidedzone find(Serializable id) {
        return null;
    }

    @Override
    public List<Decidedzone> findAll() {
        return null;
    }

    @Override
    public void save(Decidedzone dz, String[] subareaIds) {
        //.....
        //1.添加分区
        decidedzoneDao.save(dz);

        //2.更新分区的decided_id
        for (String subareaId : subareaIds) {
            Subarea subarea = subareaDao.find(subareaId);
            subarea.setDecidedzone(dz);
        }
    }

    @Override
    public void pageQuery(PageBean<Decidedzone> pb) {
        decidedzoneDao.pageQuery(pb);
    }
}
