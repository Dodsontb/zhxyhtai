package com.zhxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Learning;
import com.zhxy.service.learningservice;
@Controller
public class LearningController {

	@Autowired
	learningservice li;
	
	@RequestMapping("cp_selectBycid")
	@ResponseBody
	public List<Learning> cp_selectBycid(Integer cid, Integer templateid){
		return li.cp_selectBycid(cid, templateid);
	}
	@RequestMapping("updateStatuslearning")
	@ResponseBody
	public int updateStatuslearning(Integer uid,Integer templateid) {
		return li.updateStatuslearning(uid, templateid);
	}
	
	/*@RequestMapping("insertSelective")
	@ResponseBody
	public int insertSelective(Learning learning) {
		return li.insertSelective(learning);
	}*/
	
	@RequestMapping("selectstulearning")
	@ResponseBody
	public List<Learning> selectstulearning(int uid) {
		return li.selectstulearning(uid);
	}
}
