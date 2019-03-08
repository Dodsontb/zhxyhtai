package com.zhxy.controller.sx;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zhxy.domain.Question;
import com.zhxy.domain.Title;
import com.zhxy.service.sx.QuestionService;
import com.zhxy.service.sx.TitleService;


@Controller
public class QuestionController {


	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private TitleService titleService;
	
	//列表查询
	@RequestMapping("/question")
	public String toUserList(
			String type,
			Map<String, Object> map){
		//分页并查询
		Question question = new Question();
		if(!"全部".equals(type)) {
			question.setType(type);
		}
		
		
        List<Question> users = questionService.findList(question);
		map.put("pas", users);
		return "question/list";
	}
	
	//去添加页面
	@RequestMapping(value="/gotoPublish")
	public String gotoPublish(Model model){
		return "question/publish";
	}
	
	
	//添加
	@RequestMapping(value="/publish", method=RequestMethod.POST)
	public ModelAndView addCou(Question question,Title title,
			HttpServletRequest request){
		String q = title.getQ();
		String[] qs = q.split(",");
		
		String a1 = title.getA1();
		String[] a1s = a1.split(",");
		
		String a2 = title.getA2();
		String[] a2s = a2.split(",");
		
		String a3 = title.getA3();
		String[] a3s = a3.split(",");
		String tid = "";
		for (int i = 0; i < a3s.length; i++) {
			Title title1 = new Title();
			title1.setQ(qs[i]);
			title1.setA1(a1s[i]);
			title1.setA2(a2s[i]);
			title1.setA3(a3s[i]);
			 titleService.insert(title1);
			if(i==a3s.length-1) {
				tid += title1.getId();
			}else {
				tid += title1.getId()+",";
			}
		}
		question.setTid(tid);
		questionService.insert(question);
		ModelAndView mv=new ModelAndView("redirect:/question");
		return mv;
	}
	
	
	
	
	
	/**
	 * 去编辑页面
	 */
	@RequestMapping(value="/gotoAddQuestion/{id}")
	public String gotoEditCou(@PathVariable("id") Integer id,Model model){
		Question question = questionService.findById(id);
		String tid = question.getTid();
		String[] tids = tid.split(",");
		List<Title> titles = new ArrayList<Title>();
		for (int i = 0; i < tids.length; i++) {
			Title t = titleService.findById(Integer.parseInt(tids[i]));
			titles.add(t);
		}
		
		model.addAttribute("titles", titles);
		model.addAttribute("pa", question);
		return "question/add";
	}
	
	

	
	
    
}