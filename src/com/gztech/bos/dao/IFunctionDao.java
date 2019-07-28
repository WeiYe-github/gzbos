package com.gztech.bos.dao;

import com.gztech.bos.dao.base.IBaseDao;
import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.Function;

import java.util.List;

public interface IFunctionDao extends IBaseDao<Function> {

    //根据用户id查找权限
    public List<Function> findListByUserId(String userId);

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
