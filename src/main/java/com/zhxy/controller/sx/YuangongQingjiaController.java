package com.zhxy.controller.sx;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.zhxy.domain.Qingjiatype;
import com.zhxy.domain.Studentqingjia;
import com.zhxy.domain.Yuangongqingjia;
import com.zhxy.service.sx.YuangongQingjiaService;

@Controller
public class YuangongQingjiaController {

   @Autowired
   YuangongQingjiaService yuangongQingjiaService;
	
@RequestMapping("/toYuangongQingjia")
public String toYuangongQingjia() {
	return "sx/YuangongQingjiaList";
  }
@ResponseBody
@RequestMapping("/YuangongQingjiaList")
public List<Yuangongqingjia> queryAll(){
	
	List<Yuangongqingjia> list = yuangongQingjiaService.queryAll();
	for (Yuangongqingjia yuangongqingjia : list) {
		
		Date date =  yuangongqingjia.getDate();
		if(date!=null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String formatStr =formatter.format(date);
			System.out.println(formatStr);//2017-九月-15 13:17:08:355
			yuangongqingjia.setDateStr(formatStr);
		}	
	}
	return list;
}


@ResponseBody
@RequestMapping("delete")
public String delete(Integer id){
	System.out.println(id);
	yuangongQingjiaService.delele(id);
	return "redirect:YuangongQingjiaList";
}



@ResponseBody
@RequestMapping("/vv")
public List<Yuangongqingjia> queryByNameAndStatus(String name,Integer Status){
	
	return yuangongQingjiaService.queryByNameAndStatus(name, Status);
 }

@ResponseBody
@RequestMapping("update_yqingjia")
public List<Yuangongqingjia> update(Integer id,Integer Status){
	yuangongQingjiaService.updateYuan(id, Status);
	return yuangongQingjiaService.queryAll();
  }

@RequestMapping(value="/addYgQingjia", method=RequestMethod.POST)
public ModelAndView addCourse(Yuangongqingjia yuangongqingjia,
		HttpServletRequest request){
	Qingjiatype Qingjiatype = new Qingjiatype();
	yuangongqingjia.setQingjiastatus(2);
	yuangongqingjia.setDate(new Date());
	yuangongQingjiaService.insert(yuangongqingjia);
	ModelAndView mv=new ModelAndView("redirect:/toYuangongQingjia");
	return mv;
}
}
