package com.zhxy.controller.sx;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zhxy.domain.Answer;
import com.zhxy.domain.AnswerDto;
import com.zhxy.domain.Reply;
import com.zhxy.domain.ReplyDto;
import com.zhxy.service.sx.AnswerService;
import com.zhxy.service.sx.ReplyService;


@Controller
public class AnswerController {


	@Autowired
	private AnswerService answerService;
	
	@Autowired
	private ReplyService replyService;
	
	//列表查询
	@RequestMapping("/answer")
	public String toUserList(@RequestParam(value="qid") Integer qid,
			String clazz,
			Map<String, Object> map){
		//分页并查询
		Answer answer = new Answer();
		answer.setClazz(clazz);
		answer.setQid(qid);
		
        List<Answer> users = answerService.findList(answer);
		map.put("pas", users);
		map.put("qid", qid);
		return "question/stulist";
	}
	
	
	//添加
	@RequestMapping(value="/addAnswer", method=RequestMethod.POST)
	public ModelAndView addCou(Answer answer,
			HttpServletRequest request){
		
		
		
		Enumeration<String> parameterNames = request.getParameterNames();
		String rid = "";
        while(parameterNames.hasMoreElements()){
            String param = parameterNames.nextElement();
            if(param.startsWith("selection")){
            	Reply reply  = new Reply();
            	String id = param.substring("selection".length());   //选择题id
            	Integer tid = Integer.parseInt(id);
                String ra = request.getParameter(param);               //选择题答案
                reply.setTid(tid);
                reply.setRa(ra);
                replyService.insert(reply);
                rid +=  reply.getId()+",";
          }
        }
		
        answer.setRid(rid);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatStr =formatter.format(new Date());
		System.out.println(formatStr);//2017-九月-15 13:17:08:355
		answer.setTime(formatStr);
		answerService.insert(answer);
		ModelAndView mv=new ModelAndView("redirect:/question");
		return mv;
	}
	
	
	
	
	/**
	 * 去详情页面
	 */
	@RequestMapping(value="/gotoQuestionDetail/{id}")
	public String gotoEditCou(@PathVariable("id") Integer id,Model model){
		AnswerDto answerDto = answerService.findById(id);
		String rid = answerDto.getRid();
		String[] rids = rid.split(",");
		List<ReplyDto> replyDtos = new ArrayList<ReplyDto>();
		for (int i = 0; i < rids.length; i++) {
			ReplyDto replyDto = replyService.findDtoById(Integer.parseInt(rids[i]));
			replyDtos.add(replyDto);
		}
		
		model.addAttribute("replys", replyDtos);
		model.addAttribute("pa", answerDto);
		return "question/qusDetail";
	}

	

    
}