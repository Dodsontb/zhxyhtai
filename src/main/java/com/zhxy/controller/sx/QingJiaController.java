package com.zhxy.controller.sx;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhxy.domain.Studentqingjia;
import com.zhxy.service.sx.QingJiaService;

@Controller
public class QingJiaController {

	@Autowired
	QingJiaService qingJiaService;
	
	@RequestMapping("/toQingjia")
	public String toQingjia() {	
		return"sx/QingjiaList";
	}

@ResponseBody
@RequestMapping("QingjiaList")
public List<Studentqingjia> queryAll(){
	
	List<Studentqingjia> list = qingJiaService.queryAllStu();
	for (Studentqingjia studentqingjia : list) {
		
		Date date =  studentqingjia.getDate();
		if(date!=null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String formatStr =formatter.format(date);
			studentqingjia.setDateStr(formatStr);
		}	
	}
	return list;
}

@ResponseBody
@RequestMapping("/cc")
public List<Studentqingjia> queryByNameAndStatus(Integer StuStatus,String name){
	
	return qingJiaService.queryByStudentNameAndStudentStatu(StuStatus, name);
}
@ResponseBody
@RequestMapping("updateStatu")
public List<Studentqingjia> updateStatus(Integer id,Integer StuStatus){
		qingJiaService.updateStu(id, StuStatus);
	return qingJiaService.queryAllStu();
 }
@ResponseBody
@RequestMapping("del")
public List<Studentqingjia> deleteStu(Integer id){
	   qingJiaService.deleteStu(id); 
	return qingJiaService.queryAllStu();  //先删除 再查询
}

@RequestMapping(value="/addQingjia", method=RequestMethod.POST)
public ModelAndView addCourse(Studentqingjia studentqingjia,
		HttpServletRequest request){
	studentqingjia.setQingjiastatus(2);
	studentqingjia.setDate(new Date());
	qingJiaService.insert(studentqingjia);
	ModelAndView mv=new ModelAndView("redirect:/toQingjia");
	return mv;
}


}
