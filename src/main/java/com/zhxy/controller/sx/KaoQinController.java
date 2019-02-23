package com.zhxy.controller.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhxy.domain.Studentkaoqin;
import com.zhxy.domain.Yuangongkaoqin;
import com.zhxy.service.sx.KaoQinService;

import io.lettuce.core.dynamic.annotation.Param;

@Controller
public class KaoQinController {
	@Autowired
	KaoQinService kaoQinService;
	
	@RequestMapping("/toKaoqin")
	public String toKaoqin() {
		return "sx/KaoqinList";
	}	
	@ResponseBody
	@RequestMapping("/KaoqinList") //查询所有学生
	public PageInfo<Studentkaoqin> queryAllStu(){
		return kaoQinService.queryAll();
	}

@RequestMapping("/xx")
@ResponseBody
public PageInfo<Studentkaoqin> queryByNameAndStatus(Integer StuStatus,String name,Integer page){
	System.out.println(kaoQinService.queryByClassNameAndStuStatus(StuStatus, name,page));
	return kaoQinService.queryByClassNameAndStuStatus(StuStatus, name,page);
}
@ResponseBody
@RequestMapping("/updateStudent")
public PageInfo<Studentkaoqin> update_Stu(Integer stuid,Integer staid,Integer page) {
	kaoQinService.updateStu(stuid, staid);//先完成修改再查询
	return kaoQinService.queryByClassNameAndStuStatus(null, null, page);
}

}
