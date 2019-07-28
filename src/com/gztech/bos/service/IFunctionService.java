package com.gztech.bos.service;

import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.Function;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.service.base.IBaseService;

import java.util.List;

public interface IFunctionService extends IBaseService<Function> {
    public void pageQuery(PageBean<Function> pb);

    /**
     * 根据id查找菜单
     *
     * @param id
     * @return
     */
    public List<Function> findMenuByUserId(String id);

    /**
     * 查找所有菜单
     *
     * @return
     */
    public List<Function> findAllMenu();
}
