package com.hybe.ems.dao;

import java.util.List;

import com.hybe.ems.bo.AdminBO;

public interface AdminDao {
public int createAdminBO(AdminBO adminBO)throws Exception;
public List<AdminBO>getAdminList()throws Exception;
public AdminBO getAdminValue(int adminId)throws Exception;
public int updateAdmin(AdminBO adminBO )throws Exception;
public int deleteAdmin(AdminBO adminBO)throws Exception;
AdminBO getAdminValue(Long adminId) throws Exception;
}
