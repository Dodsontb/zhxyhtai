package com.zhxy.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zhxy.dao.NoticeMapper;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpUser;
import com.zhxy.domain.Grade;
import com.zhxy.domain.HxkPageBean;
import com.zhxy.domain.Message;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;
import com.zhxy.handler.MyWebSocketHandler;
import com.zhxy.hxktask.DynamicTaskJobs;
import com.zhxy.hxktask.ExamTaskJob;
import com.zhxy.service.hxk_history;

@Controller
public class WriteController {

			@Autowired
			hxk_history service;
			
			@Autowired
			NoticeMapper noticeMapper;
			
			@Autowired
			HttpSession session;
			
			String hxk="";
			
			@Autowired
			MyWebSocketHandler handler;
			
			@RequestMapping("/hxk_message")
			public String hxk_message() {
				return "hxk/hxk_message";
			}
			
			@RequestMapping("/index")
			public String index() {
				return "hxk/index";
			}
			
			@RequestMapping("/hxk_history")
			public String history() {
				return "hxk/hxk_history";
			}
			
			
			@RequestMapping("/hxk_write")
			public String hxk_write() {
				//dynamicTaskJobs.addTaskTimerJob(examJob,"*/5 * * * * *");
				return "hxk/hxk_write";
			}
			
			
			@RequestMapping("/aaa")
			public String message() {
				return "hxk/message";
			}
			
			 @Autowired
			 DynamicTaskJobs dynamicTaskJobs;

			    @Autowired
			    ExamTaskJob examJob;
			
			@RequestMapping("/queryNoticeAll")
			@ResponseBody
			public List<Notice> queryNoticeAll(Model model) {
				List<Notice> list=service.queryNoticeAll();
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/queryMessageAll")
			@ResponseBody
			public List<Message> queryMessageAll(Model model) {
				CpUser u =  (CpUser)session.getAttribute("user");
				List<Message> list=service.queryMessage();
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/queryByHead")
			@ResponseBody
			public HxkPageBean<Notice> queryByHead(Model model,String name,int typeid,int currpage) {
				return service.queryByHead(name,typeid,currpage);
			}
			
			@RequestMapping("/queryByName")
			@ResponseBody
			public List<Message> queryByName(Model model,String username) {
				List<Message> list=service.queryByMessageName(username);
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/queryGrade")
			@ResponseBody
			public List<Grade> queryGrade(Model model) {
				List<Grade> list=service.queryGrade();
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/queryClazz")
			@ResponseBody
			public List<Clazz> queryClazz(Model model) {
				List<Clazz> list=service.queryClazz();
				model.addAttribute("list", list);
				return list;
			}
				
			
			@RequestMapping("/queryNoticeById")
			public String queryNoticeById(Model model, int Notice_Id) {
				Notice list=service.queryNoticeById(Notice_Id);
				model.addAttribute("list", list);
				return "hxk/hxk_details";
			}
			
			
			@RequestMapping("/plqueryNoticeType")
			@ResponseBody
			public List<Noticetype> plqueryNoticeType(Model model){
				List<Noticetype> list=service.plqueryNoticeType();
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/fileup")
			@ResponseBody
			public List<String> fileup(@RequestParam MultipartFile[] files,HttpSession session) {
				List<String> list=new ArrayList<>();
				for (MultipartFile multipartFile : files) {
					try {
						System.out.println(multipartFile.getOriginalFilename());	
						hxk=multipartFile.getOriginalFilename();
						File file=new File("d:/img/"+multipartFile.getOriginalFilename());
						list.add(multipartFile.getOriginalFilename());
						multipartFile.transferTo(file);
					} catch (IllegalStateException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				session.setAttribute("fileimg", list);
				return list;
			}
			
			
			@SuppressWarnings("unchecked")
			@RequestMapping("/insertNotice")
			@ResponseBody
			public int insertNotice(Notice notice,int[] cid) throws ParseException{
				/*CpUser user =  (CpUser)session.getAttribute("user");*/
				List<String> urls=(List<String>) session.getAttribute("fileimg");
			
				notice.setUid(1);
				for (int i = 0; i < cid.length; i++) {
					System.out.println("controller:"+cid[i]);
				}
				String time=notice.getNtime().replace("T", " ")+":00";
				/*SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				notice.setNtime= formatter.parse(time);
				notice.setNtime(s);*/
				int i=service.insertNotice(notice, cid, urls);
				// System.out.println("13243254356"+s);
				 dynamicTaskJobs.addTaskJob(examJob,time);
			   //  dynamicTaskJobs.addTaskTimerJob(examJob,"*/5 * * * * *");
			     
				 return i;
			}
			
			@RequestMapping("/queryCpUser")
			@ResponseBody
			public List<CpUser> queryCpUser(Model model) {
				List<CpUser> list=service.queryCpUser();
				model.addAttribute("list", list);
				return list;
				
			}
			
			@RequestMapping("/deleteMessage")
			public String deleteMessage(int messageId) {
				int i=service.deleteMessage(messageId);
				return "redirect:hxk_message";
			}
			
			@RequestMapping("/queryCpUserByName")
			@ResponseBody
			public List<CpUser> queryCpUserByName(Model model,String username) {
				List<CpUser> list=service.queryCpUserByName(username);
				model.addAttribute("list", list);
				return list;
			}
			
			@RequestMapping("/selectUid")
			@ResponseBody
			public Message selectUid(int uid) {
				return service.selectUid(uid);
			}
			
			@ResponseBody
			@RequestMapping("/senderMessage")
			public String senderMessage(HttpSession session,Message m,HttpServletResponse response) {
				response.setCharacterEncoding("utf-8");
				/*CpUser u =  (CpUser)session.getAttribute("user");*/
				m.setUid(1);
				System.out.println("用户-发送消息"+m.getUid()+">>"+m.getReceiver().length+"个人");
				//m.setUid (u.getUserid());
				//m.setTitle("好友消息");
				int jg=service.insertMessage(m);
				String status =null;
				//显示自己发送的信息
				status = handler.sendMsg(m.getUid()+"", "<p class=\"m_message_left\"><i class=\"msg_input\"></i>"+m.getMcontent()+"</p>");
			//	显示好友发来的信息
				for (int receiver : m.getReceiver()) {
					System.out.println("接收人："+receiver);
					status = handler.sendMsg(receiver+"", "<p class=\"m_message_right\"><i class=\"msg_input\"></i>"+m.getMcontent()+"</p>");
				}
			System.out.println("存储结果:"+jg+"发送结果："+status);
				return status;
			}
			
			
			@ResponseBody
			@RequestMapping("/getChatRecord")
			public List<Message> getChatRecord(HttpSession session,HttpServletResponse response,int chatid) {
				response.setCharacterEncoding("utf-8");
				CpUser u =  (CpUser)session.getAttribute("user");
				System.out.println("查询聊天记录"+chatid);
				return service.getChatRecord(u.getUserid(),chatid);
			}
}
