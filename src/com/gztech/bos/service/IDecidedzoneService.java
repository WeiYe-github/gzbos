package com.gztech.bos.service;

import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Region;
import com.gztech.bos.service.base.IBaseService;

import java.util.List;

public interface IDecidedzoneService extends IBaseService<Decidedzone> {


    /**
     * @param dz         定区数据
     * @param subareaIds 分区的ids
     */
    public void save(Decidedzone dz, String[] subareaIds);

    public void pageQuery(PageBean<Decidedzone> pb);
}
