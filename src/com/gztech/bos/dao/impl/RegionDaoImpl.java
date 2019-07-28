package com.gztech.bos.dao.impl;

import com.gztech.bos.dao.IRegionDao;
import com.gztech.bos.dao.IStaffDao;
import com.gztech.bos.dao.base.BaseDaoImpl;
import com.gztech.bos.model.PageBean;
import com.gztech.bos.model.Region;
import com.gztech.bos.model.Staff;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegionDaoImpl extends BaseDaoImpl<Region> implements IRegionDao {


}
