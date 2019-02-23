package com.zhxy.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhxy.mapper.KaoqinStatisMapper;
import com.zhxy.domain.BarStatisListData;
import com.zhxy.domain.KaoqinStatis;
import com.zhxy.service.KaoqinStatisService;
@Service
public class KaoqinStatisServiceImpl implements KaoqinStatisService {

	@Autowired
	private KaoqinStatisMapper ksMapper;
	
	@Override
	public BarStatisListData queryKaoqinStatisByClassId(String classId, String dateCondition, String date1,
			String date2) {
		List<List<Integer>> list;
		List<KaoqinStatis> kqList = ksMapper.queryKaoqinStatisByClassId(classId, dateCondition, date1, date2);
		BarStatisListData bslData = getStatisList(kqList);
		return getCountExtra(bslData, kqList);
	}
	
	private BarStatisListData getStatisList(List<KaoqinStatis> paramList){
		List xArisData = new ArrayList();
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		List list4 = new ArrayList();
		List<List> list = new ArrayList<List>();
		for (KaoqinStatis ks : paramList) {
			xArisData.add(ks.getDate());
			list1.add(ks.getSta1());
			list2.add(ks.getSta2());
			list3.add(ks.getSta3());
			list4.add(ks.getSta4());
		}
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		return new BarStatisListData(xArisData, list);
	}

	private BarStatisListData getCountExtra(BarStatisListData bslData, List<KaoqinStatis> paramList) {
		Integer count1 = 0;
		Integer count2 = 0;
		for (KaoqinStatis ks : paramList) {
			count1 += ks.getCount1();
			count2 += ks.getCount2();
		}
		bslData.setCount1(count1);
		bslData.setCount2(count2);
		return bslData;
	}
}
