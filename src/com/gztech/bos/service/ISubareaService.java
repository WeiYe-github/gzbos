package com.gztech.bos.service;

import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Subarea;
import com.gztech.bos.model.User;
import com.gztech.bos.service.base.IBaseService;

import java.util.List;

public interface ISubareaService extends IBaseService<Subarea> {
    public void pageQuery(PageBean<Subarea> pb);

    public List<Subarea> findAllWithUnbind();
}
