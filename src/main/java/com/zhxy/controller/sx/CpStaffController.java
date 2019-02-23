package com.zhxy.controller.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.CpStaff;
import com.zhxy.service.sx.CpStaffService;

@Controller
public class CpStaffController {

	@Autowired
	CpStaffService cpStaffService;
	
	//查询所有员工
	@RequestMapping(value = "/getAllStaff", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<CpStaff> selectCollege(){
        List<CpStaff> universityListInfo=cpStaffService.findList();
        for (CpStaff cpStaff : universityListInfo) {
			System.out.println(cpStaff.toString());
		}
        return universityListInfo;
    }

}
