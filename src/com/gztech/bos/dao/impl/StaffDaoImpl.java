package com.gztech.bos.dao.impl;

import com.gztech.bos.dao.IStaffDao;
import com.gztech.bos.dao.IUserDao;
import com.gztech.bos.dao.base.BaseDaoImpl;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Staff;
import com.gztech.bos.model.User;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StaffDaoImpl extends BaseDaoImpl<Staff> implements IStaffDao {


}
