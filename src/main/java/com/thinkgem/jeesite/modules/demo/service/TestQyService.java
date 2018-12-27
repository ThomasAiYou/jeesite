/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.demo.entity.TestQy;
import com.thinkgem.jeesite.modules.demo.dao.TestQyDao;

/**
 * demoService
 * @author tyk
 * @version 2018-12-23
 */
@Service
@Transactional(readOnly = true)
public class TestQyService extends CrudService<TestQyDao, TestQy> {

	public TestQy get(String id) {
		return super.get(id);
	}
	
	public List<TestQy> findList(TestQy testQy) {
		return super.findList(testQy);
	}
	
	public Page<TestQy> findPage(Page<TestQy> page, TestQy testQy) {
		return super.findPage(page, testQy);
	}
	
	@Transactional(readOnly = false)
	public void save(TestQy testQy) {
		super.save(testQy);
	}
	
	@Transactional(readOnly = false)
	public void delete(TestQy testQy) {
		super.delete(testQy);
	}
	
}