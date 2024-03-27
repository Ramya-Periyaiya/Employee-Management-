package com.hybe.ems.service;

import java.util.List;

import com.hybe.ems.bo.AdminBO;

public interface AdminService {

	public int createAdmin(AdminBO adminBO)throws Exception;

	public List<AdminBO> getAdminList()throws Exception;
	
	public int updateAdmin(AdminBO adminBO)throws Exception;

	public int deleteAdmin(AdminBO adminBO)throws Exception;

	public AdminBO getAdminValue(long adminId)throws Exception;


	
}
