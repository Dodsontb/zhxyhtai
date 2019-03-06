package com.zhxy.controller.sx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhxy.domain.Yuangongkaoqin;
import com.zhxy.service.sx.YuangongKaoQinService;

@Controller
public class YuangongKaoqinController {
	@Autowired
	YuangongKaoQinService yuangongKaoQinService;
	
@RequestMapping("/toYuangongKaoqin")
public String toYuangongKaoqin() {	
	return"sx/YuangongKaoqinList";
}


@ResponseBody
@RequestMapping("/YuangongKaoqinList")
public List<Yuangongkaoqin> queryAllyg() {
	
	return yuangongKaoQinService.queryAllyg();
}
@ResponseBody
@RequestMapping("/zz")
public List<Yuangongkaoqin> queryByNameAndStatus(Integer StuStatus, String name){
	
	return yuangongKaoQinService.queryByYgNameAndStuStatus(StuStatus, name);
}

@ResponseBody
@RequestMapping("/updateYg")
public List<Yuangongkaoqin> update_yg(Integer id,Integer StuStatus){
	 yuangongKaoQinService.updateYg(id, StuStatus);
	return yuangongKaoQinService.queryAllyg();
}
	
@ResponseBody
@RequestMapping("/batchInsert")
public List<Yuangongkaoqin> batch() {
    yuangongKaoQinService.batch();
    return yuangongKaoQinService.queryAllyg();
}
}
