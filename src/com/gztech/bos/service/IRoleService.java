package com.gztech.bos.service;

import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Role;
import com.gztech.bos.service.base.IBaseService;

public interface IRoleService extends IBaseService<Role> {


    /**
     * @param role       角色模型
     * @param funtionIds 权限、功能id
     */
    public void save(Role role, String funtionIds);


    public void pageQuery(PageBean<Role> pb);
}
