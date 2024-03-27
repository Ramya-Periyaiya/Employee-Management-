package com.hybe.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hybe.ems.bo.AdminBO;
import com.hybe.ems.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
@Autowired
private AdminDao adminDao;
	@Override
	public int createAdmin(AdminBO adminBO) throws Exception {
		// TODO Auto-generated method stub
		int count=adminDao.createAdminBO(adminBO);
		return count;
	}

	@Override
	public List<AdminBO> getAdminList() throws Exception {
		// TODO Auto-generated method stub
		return adminDao.getAdminList();
	}

	@Override
	public int updateAdmin(AdminBO adminBO) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.updateAdmin(adminBO);
	}

	@Override
	public int deleteAdmin(AdminBO adminBO) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.deleteAdmin(adminBO);
	}

	@Override
	public AdminBO getAdminValue(long adminId) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.getAdminValue(adminId);
	}

	
	

}
