package com.zhxy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.dao.CpStaffMapper;
import com.zhxy.dao.CpUserMapper;
import com.zhxy.domain.CpUser;
import com.zhxy.service.cpUserservice;
@Service
@Transactional
public class cpUser implements cpUserservice{

	@Autowired
	CpUserMapper user;
	@Autowired 
	CpStaffMapper yuan;
	@Override
	public CpUser login(String username, String password) {
		// TODO Auto-generated method stub
		CpUser userinfo = user.login(username, password);
		if (userinfo!=null) {
			System.out.println("这是查询出来的"+userinfo.getUsertypenub());
			/*if(userinfo.getUsertypenub()==0) {
				int staffid=userinfo.getUsertypeid();
				System.out.println("登入的是员工");
			}else if(userinfo.getUsertypenub()==1) {
				System.out.println("登入的是学生");
			}else if(userinfo.getUsertypenub()==3) {
				System.out.println("登入的是家长");
			}*/
		}
		return userinfo;
	}
	
}
