package com.gztech.bos.web.action.base;

import com.gztech.bos.dao.IWorkordermanageDao;
import com.gztech.bos.model.Noticebill;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.service.*;
import com.gztech.crm.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public abstract class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

    private T t;//属性-用于接收参数

    //=================分页的参数=====================
    protected int page;
    protected int rows;

    public void setPage(int page) {
        this.page = page;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    //=================分页的模型 =====================
    protected PageBean<T> pb = new PageBean<T>();
    //空参构造方法实现t的实例化


    //===============抽取service===============
    @Autowired
    protected IUserService userService;
    @Autowired
    protected ISubareaService subareaService;
    @Autowired
    protected IStaffService staffService;
    @Autowired
    protected IRegionService regionService;

    @Autowired
    protected IDecidedzoneService decidedzoneService;

    @Autowired
    protected CustomerService customerService;

    @Autowired
    protected INoticebillService noticebillService;

    @Autowired
    protected IWorkordermanageService workordermanageService;

    @Autowired
    protected IFunctionService functionService;

    @Autowired
    protected IRoleService roleService;

    public BaseAction() {
        System.out.println("----------------");
        System.out.println(this);
        System.out.println(this.getClass().getGenericSuperclass());
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();

       /* if(this.getClass().getGenericSuperclass() instanceof ParameterizedType){
            //1.获取t的真实类型
            System.out.println("1111111111111111111111");
             pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        }else{
             pt = (ParameterizedType) this.getClass().getSuperclass().getGenericSuperclass();
            System.out.println("22222222222222222222");
        }*/


        //获取泛型真实类型
        Type[] types = pt.getActualTypeArguments();

        //把type类型赋值给Class类型
        Class<T> clz = (Class<T>) types[0];

        //设置离线查询对象
        DetachedCriteria dc = DetachedCriteria.forClass(clz);
        pb.setDetachedCriteria(dc);

        //2.通过反射new个对象
        try {
            t = clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T getModel() {
        return t;
    }

    //插入数据
    public abstract String save();

    //修改数据
    public abstract String update();

    //删除数据
    public abstract String delete() throws IOException;

    //获取列表数据
    public abstract String list();

    /**
     * 返回json数据给客户端
     *
     * @param obj      转json的对象
     * @param excludes 排除的属性
     */
    public void responseJson(Object obj, String[] excludes) throws IOException {
        JsonConfig config = new JsonConfig();
        config.setExcludes(excludes);

        //3.2创建json对象
        /**
         * 注意：如果是集合，使用JSONArray类来转换
         */
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setHeader("content-type", "text/json;charset=utf-8");
        if (obj instanceof Collection) {
            JSONArray jsonArray = JSONArray.fromObject(obj, config);
            response.getWriter().write(jsonArray.toString());
        } else {
            JSONObject jsonObject = JSONObject.fromObject(obj, config);
            response.getWriter().write(jsonObject.toString());
        }


    }

    public void responseStr(String message) throws IOException {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setHeader("content-type", "text/html;charset=utf-8");
        response.getWriter().write(message);
    }
}
