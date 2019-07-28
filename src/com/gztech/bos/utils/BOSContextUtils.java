package com.gztech.bos.utils;

import com.gztech.bos.model.User;
import org.apache.struts2.ServletActionContext;

import static org.apache.struts2.ServletActionContext.*;

public class BOSContextUtils {
    public static User loginUser() {
        return (User) getRequest().getSession().getAttribute("loginUser");
    }
}
