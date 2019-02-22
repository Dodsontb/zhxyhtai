package com.zhxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.dao.MessageMapper;
import com.zhxy.dao.NoticeMapper;
import com.zhxy.domain.Clazz;
import com.zhxy.domain.CpUser;
import com.zhxy.domain.Grade;
import com.zhxy.domain.HxkPageBean;
import com.zhxy.domain.Message;
import com.zhxy.domain.Notice;
import com.zhxy.domain.Noticetype;
import com.zhxy.service.hxk_history;


@Service
public class historyServiceImpl  implements hxk_history{
	
	@Autowired
	NoticeMapper mapper;
	
	@Autowired
	MessageMapper mmapper;
	
	@Override
	public List<Notice> queryNoticeAll() {
		// TODO Auto-generated method stub
		return mapper.queryNoticeAll();
	}

	@Override
	public Notice queryNoticeById(int Notice_Id) {
		// TODO Auto-generated method stub
		return mapper.queryNoticeById(Notice_Id);
	}

	@Override
	public HxkPageBean<Notice> queryByHead(String name,int typeid,int currpage) {
		// TODO Auto-generated method stub
		HxkPageBean<Notice> bean=new HxkPageBean<>(name,typeid,currpage);
		List<Notice> list=mapper.queryByHead(bean);
		int count=mapper.queryByHeadCount(bean);
		bean.setPagecount(count);
		bean.setLists(list);
		return bean;
	}

	@Override
	public int deleteNotice(int nstate) {
		// TODO Auto-generated method stub
		return mapper.deleteNotice(nstate);
	}

	@Override
	public List<Noticetype> plqueryNoticeType() {
		// TODO Auto-generated method stub
		return mapper.plqueryNoticeType();
	}

	@Override
	public List<Grade> queryGrade() {
		// TODO Auto-generated method stub
		return mapper.queryGrade();
	}

	@Override
	public List<Clazz> queryClazz() {
		// TODO Auto-generated method stub
		return mapper.queryClazz();
	}

	@Override
	public int insertNotice(Notice notice,int[] cid,List<String> urls) {
		// TODO Auto-generated method stub
		/*Notice n=new Notice();*/
		/*n.setHeadline(headline);
		n.setNcontent(ncontent);
		n.setTypeid(typeid);
		
		n.setUid(uid);*/
		int i=mapper.insertNotice(notice);
		int noticeId=notice.getNoticeId();
		System.out.println("Notice_Id:"+noticeId);
		/*int s=mapper.insertRelation(cid, noticeId);*/
		for (int j = 0; j < cid.length; j++) {
			System.out.println(cid[j]);
			mapper.insertRelation(cid[j], noticeId);
		}
		for (String string : urls) {
			mapper.insertImg("file/"+string, noticeId);
		}
		return i;
	}

	@Override
	public List<Message> queryMessage() {
		// TODO Auto-generated method stub
		return mmapper.queryMessage();
	}

	@Override
	public List<Message> queryByMessageName(String username) {
		// TODO Auto-generated method stub
		return mmapper.queryByMessageName(username);
	}

	@Override
	public List<CpUser> queryCpUser() {
		// TODO Auto-generated method stub
		return mmapper.queryCpUser();
	}

	@Override
	public List<CpUser> queryCpUserByName(String username) {
		// TODO Auto-generated method stub
		return mmapper.queryCpUserByName(username);
	}

	@Override
	public int deleteMessage(int messageId) {
		// TODO Auto-generated method stub
		return mmapper.deleteMessage(messageId);
	}

	@Override
	public int updataNotice() {
		// TODO Auto-generated method stub
		return mapper.updataNotice();
	}

	@Override
	public int insertMessage(Message message) {
		// TODO Auto-generated method stub
		return mmapper.insertMessage(message);
	}

	@Override
	public Message selectUid(int uid) {
		// TODO Auto-generated method stub
		return mmapper.selectUid(uid);
	}

	@Override
	public List<Message> getChatRecord(int sendid, int receiver) {
		// TODO Auto-generated method stub
		return mmapper.getChatRecord(sendid, receiver);
	}


}
