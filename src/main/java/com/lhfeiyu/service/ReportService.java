package com.lhfeiyu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhfeiyu.dao.ReportMapper;
import com.lhfeiyu.po.Report;

/**
* <strong> 描&nbsp;&nbsp;&nbsp;&nbsp;述：</strong> 业务层：通用-Report <p>
* <strong> 作&nbsp;&nbsp;&nbsp;&nbsp;者：</strong> 虞荣华 <p>
* <strong> 编写时间：</strong>2016年3月20日22:22:22<p>
* <strong> 公&nbsp;&nbsp;&nbsp;&nbsp;司：</strong> 成都蓝海飞鱼科技有限公司 <p>
* <strong> 版&nbsp;&nbsp;&nbsp;&nbsp;本：</strong> 2.0 <p>
 */
@Service
public class ReportService extends CommonService<Report> {

	@Autowired
	ReportMapper reportmapper;
	
	public Report selectService(Map<String, Object> map) {
		return super.selectByCondition(map);
	}
	
	public List<Report> selectListService(Map<String, Object> map) {
		return super.selectListByCondition(map);
	}
	
	public int updateService(Report report) {
		return super.updateByPrimaryKeySelective(report);
	}
	
	public int insertService(Report report) {
		return super.insertSelective(report);
	}
	
	public int deleteService(Integer id) {
		return super.deleteByPrimaryKey(id);
	}

}