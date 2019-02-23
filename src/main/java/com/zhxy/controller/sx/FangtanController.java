package com.zhxy.controller.sx;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhxy.domain.Studentfangtan;
import com.zhxy.service.sx.FangtanService;

@Controller
public class FangtanController {

	@Autowired
	FangtanService fangtanService;
	
@RequestMapping("/toFangtan")
public String toFangtan() {
	
	return"sx/FangtanList";
  }

@ResponseBody
@RequestMapping("/FangtanList")
public List<Studentfangtan> queryAll(){
	
	List<Studentfangtan> list = fangtanService.queryAll();
	for (Studentfangtan ft : list) {
		
		Date date =  ft.getDate();
		if(date!=null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String formatStr =formatter.format(date);
			System.out.println(formatStr);//2017-九月-15 13:17:08:355
			ft.setDateStr(formatStr);
		}	
	}
	return list;
}

@ResponseBody
@RequestMapping("/bb")
public List<Studentfangtan> queryByNameAndStatus(String name,Integer Status){
	
	return fangtanService.queryByStuNameAndStatus(name, Status);
  }


@ResponseBody
@RequestMapping("/updateStu")
public List<Studentfangtan> update_stu(Integer id,Integer Status){
	fangtanService.updateStu(id, Status);
	return fangtanService.queryAll();
 }

@RequestMapping(value="/addft", method=RequestMethod.POST)
public ModelAndView addCourse(Studentfangtan ft,
		HttpServletRequest request){
	ft.setFangtanstatus(2);
	ft.setDate(new Date());
	fangtanService.insert(ft);
	ModelAndView mv=new ModelAndView("redirect:/toFangtan");
	return mv;
  } 


/*	@ResponseBody
	@RequestMapping("/del")
	public List<Studentfangtan> deleteStu(Integer id){
		fangtanService.delete(id); 
		return fangtanService.queryAll();  //先删除 再查询
	}*/
}
