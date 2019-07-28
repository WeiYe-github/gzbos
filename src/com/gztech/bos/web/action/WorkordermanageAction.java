package com.gztech.bos.web.action;

import com.gztech.bos.model.Decidedzone;
import com.gztech.bos.model.Workordermanage;
import com.gztech.bos.web.action.base.BaseAction;
import com.gztech.crm.domain.Customer;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.List;

public class WorkordermanageAction extends BaseAction<Workordermanage> {


    @Override
    public String save() {
        workordermanageService.save(getModel());
        try {
            responseStr("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
