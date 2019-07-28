package com.gztech.bos.service;

import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Region;
import com.gztech.bos.model.Staff;
import com.gztech.bos.service.base.IBaseService;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

public interface IRegionService extends IBaseService<Region> {


    public void saveAll(List<Region> regions);

    /**
     * 分页查询
     *
     * @param pb
     */
    public void pageQuery(PageBean<Region> pb);

}
