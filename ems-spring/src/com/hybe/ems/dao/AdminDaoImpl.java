package com.hybe.ems.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hybe.ems.bo.AdminBO;
import com.mysql.jdbc.Connection;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Override
	public int createAdminBO(AdminBO adminBO) throws Exception {
		int count=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb", "root", "admin");
			Statement statement=(Statement) con.createStatement();
			String sql="insert into admin(firstName,address,mobileNum,emailId)value('"+adminBO.getFirstName()+"','"+adminBO.getAddress()+"','"+adminBO.getMobileNum()+"','"+adminBO.getEmailId()+"')";
		    statement.execute(sql);
		    count=statement.getUpdateCount();
		    }catch(Exception e){
		    	e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<AdminBO> getAdminList() throws Exception {
		List<AdminBO> adminBOList=new ArrayList<AdminBO>();
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb", "root", "admin");
		Statement statement=(Statement) con.createStatement();
		String sql="select * from admin";
		
		ResultSet resultSet=statement.executeQuery(sql);
		while(resultSet.next()){
			
			AdminBO adminBO=new AdminBO();
			
			long adminId=resultSet.getInt(1);
			String firstName=resultSet.getString(2);
			String address=resultSet.getString(3);
			String emailId=resultSet.getString(4);
			String mobileNum=resultSet.getString(5);
			
			adminBO.setAdminId(adminId);
			adminBO.setFirstName(firstName);
			adminBO.setAddress(address);
			adminBO.setEmailId(emailId);
			adminBO.setMobileNum(mobileNum);
			
			adminBOList.add(adminBO);
			
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return adminBOList;
	}

	@Override
	public AdminBO getAdminValue(Long adminId) throws Exception {
		AdminBO adminBO=new AdminBO();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb", "root", "admin");
			Statement statement=(Statement) con.createStatement();
			String sql="select * from admin where adminId="+adminId+"";
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()){
				
				
				String firstName=resultSet.getString(2);
				String address=resultSet.getString(3);
				String emailId=resultSet.getString(4);
				String mobileNum=resultSet.getString(5);
				
				adminBO.setAdminId(adminId);
				adminBO.setFirstName(firstName);
				adminBO.setAddress(address);
				adminBO.setEmailId(emailId);
				adminBO.setMobileNum(mobileNum);
				
				
			}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return adminBO;
	
			
		}

	
	

	@Override
	public int updateAdmin(AdminBO adminBO) throws Exception {
		int count=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb", "root", "admin");
			Statement statement=(Statement) con.createStatement();
			String sql = "UPDATE admin SET firstName='"+adminBO.getFirstName()+"', address='"+adminBO.getAddress()+"', mobileNum='"+adminBO.getMobileNum()+"', emailId='"+adminBO.getEmailId()+"'";
		    statement.execute(sql);
		    count=statement.getUpdateCount();
		    }catch(Exception e){
		    	e.printStackTrace();
		}
		return count;
	
		
	}

	@Override
	public int deleteAdmin(AdminBO adminBO) throws Exception {
		int count=0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/admindb", "root", "admin");
			Statement statement=(Statement) con.createStatement();
			String sql="delete  from admin where adminId="+adminBO.getAdminId()+"";
			 statement.execute(sql);
			count=statement.getUpdateCount();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public AdminBO getAdminValue(int adminId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
