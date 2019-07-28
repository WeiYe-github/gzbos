package com.gztech.bos.service;

import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.Noticebill;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.service.base.IBaseService;

public interface INoticebillService extends IBaseService<Noticebill> {

    /**
     * @param entity        业务通知单模型
     * @param decidedzoneId 定区id,用于自动分单
     */
    public void save(Noticebill entity, String decidedzoneId);
}
