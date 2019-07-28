package com.gztech.bos.service;

import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Staff;
import com.gztech.bos.model.User;
import com.gztech.bos.service.base.IBaseService;

import java.util.List;

public interface IStaffService extends IBaseService<Staff> {


    /**
     * 分页查询
     *
     * @param pb
     */
    public void pageQuery(PageBean<Staff> pb);

    /**
     * 批量删除取派员
     *
     * @param ids 【001,002,003】 以豆号隔开
     */
    public void deleteBatch(String ids);

    public List<Staff> findAllWithNoDelete();
}
