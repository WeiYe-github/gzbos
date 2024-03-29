package com.gztech.bos.web.action;

import com.gztech.bos.model.Noticebill;
import com.gztech.bos.web.action.base.BaseAction;
import com.gztech.crm.domain.Customer;

import java.io.IOException;

/**
 * 业务通知单
 * :客服接电话下快递单
 */
public class NoticebillAction extends BaseAction<Noticebill> {

    /**
     * 返回json数据
     */
    private String tel;//电话

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void findCustomerByTel() throws IOException {
        //远程调用
        Customer customer = customerService.findCustomerByTel(tel);
        responseJson(customer, new String[]{});
    }

    private String decidedzoneId;

    public void setDecidedzoneId(String decidedzoneId) {
        this.decidedzoneId = decidedzoneId;
    }

    @Override
    public String save() {

        //获取表单数据
        //System.out.println(getModel());
        noticebillService.save(getModel(), decidedzoneId);

        //保存
        return NONE;
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete() throws IOException {
        return null;
    }

    @Override
    public String list() {
        return null;
    }
}
