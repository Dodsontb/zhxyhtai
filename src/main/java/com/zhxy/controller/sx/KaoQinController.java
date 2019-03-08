package com.zhxy.controller.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
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
	public PageInfo KaoqinList(@RequestBody @RequestParam("page") Integer page) {
		PageHelper.startPage(page, 10);
		final List<Studentkaoqin> list = kaoQinService.queryAll();
		return new PageInfo<>(list);
	}
@RequestMapping("/xx")
@ResponseBody
public List<Studentkaoqin> queryByNameAndStatus(Integer id,String name){
	
	return kaoQinService.queryByClassNameAndStuStatus(id, name);
}
@ResponseBody
@RequestMapping("/updateStudent")
public List<Studentkaoqin> update_Stu(Integer stuid,Integer staid) {
	kaoQinService.updateStu(stuid, staid);//先完成修改再查询
	return kaoQinService.queryAll();
}
@ResponseBody
@RequestMapping("/batchInsertxs")
public List<Studentkaoqin> batch() {
    kaoQinService.batchxs();
    return kaoQinService.queryAll();
}
}
