package com.hybe.ems.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hybe.ems.bo.AdminBO;
import com.hybe.ems.service.AdminService;

@Controller
public class EmployeeController {
	
 @Autowired
 private AdminService adminService;
 
 @RequestMapping(value="/",method=RequestMethod.GET)
 public String home(Model model)throws Exception{
	 
	return "index";	 
 }
 
 @RequestMapping(value="/create-admin",method=RequestMethod.GET)
 public String createAdmin(Model model)throws Exception{
	 model.addAttribute("adminBO",new AdminBO());
	return "create-admin";
 }
 @RequestMapping(value="/create-admin",method=RequestMethod.POST)
 public String createAdmin(@ModelAttribute("adminBO") AdminBO adminBO,Model model)throws Exception{
	 
	 try{
		 if(null==adminBO){
			 return"create-admin";
		 }
		 int adminId=adminService.createAdmin(adminBO);
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	return "redirect:/view-admin";	 
 }


@RequestMapping(value="/view-admin",method=RequestMethod.GET)

public String viewAdmin(Model model)throws Exception{
	try{
		List<AdminBO>adminBOList=new ArrayList<AdminBO>();
		adminBOList =adminService.getAdminList();
		model.addAttribute("adminBOList",adminBOList);
	}catch(Exception e){
		e.printStackTrace();
	}
	return "view-admin";
}

@RequestMapping(value="/update-admin",method=RequestMethod.GET)
public String updateAdmin(Model model,HttpServletRequest request)throws Exception{
	AdminBO adminBO=new AdminBO();
	long adminId=0;
	String id=request.getParameter("adminId");
	if(null!=id){
		adminId=Long.parseLong(id);
	}
	adminBO=adminService.getAdminValue(adminId);
	model.addAttribute("adminBO", adminBO);
	return "update-admin";
	
}

@RequestMapping(value="/update-admin",method=RequestMethod.POST)
public String updateAdmin(@ModelAttribute("adminBO")AdminBO adminBO,Model model)throws Exception{
	try{
		long adminId=adminService.updateAdmin(adminBO);
	}catch(Exception e){
		e.printStackTrace();
	}
	return "redirect:/view-admin";
}

@RequestMapping(value="/delete-admin",method=RequestMethod.GET)
public String deleteAdmin(Model model,HttpServletRequest request)throws Exception{
	AdminBO adminBO=new AdminBO();
	long adminId=0;
	String id=request.getParameter("adminId");
	if(null!=id){
		adminId=Long.parseLong(id);
		adminBO.setAdminId(adminId);
	}
	int count=adminService.deleteAdmin(adminBO);
	model.addAttribute("adminBO", adminBO);
	
	return "redirect:/view-admin";
}
}
