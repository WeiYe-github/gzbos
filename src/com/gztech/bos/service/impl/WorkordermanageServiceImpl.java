package com.gztech.bos.service.impl;

import com.gztech.bos.dao.IDecidedzoneDao;
import com.gztech.bos.dao.ISubareaDao;
import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Subarea;
import com.gztech.bos.model.Workordermanage;
import com.gztech.bos.service.IDecidedzoneService;
import com.gztech.bos.service.IWorkordermanageService;
import com.gztech.bos.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional//事务是由事务管理器来实现
public class WorkordermanageServiceImpl extends BaseServiceImpl<Workordermanage> implements IWorkordermanageService {


    @Override
    public void save(Workordermanage entity) {
        workordermanageDao.save(entity);
    }

    @Override
    public void delete(Workordermanage entity) {

    }

    @Override
    public void update(Workordermanage entity) {

    }

    @Override
    public Workordermanage find(Serializable id) {
        return null;
    }

    @Override
    public List<Workordermanage> findAll() {
        return null;
    }
}
