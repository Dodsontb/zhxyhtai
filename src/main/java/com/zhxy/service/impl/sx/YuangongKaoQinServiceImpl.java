package com.zhxy.service.impl.sx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhxy.mapper.CpPositionMapper;
import com.zhxy.mapper.CpStaffMapper;
import com.zhxy.mapper.YuangongkaoqinMapper;
import com.zhxy.domain.CpPosition;
import com.zhxy.domain.CpStaff;
import com.zhxy.domain.Statuastype;
import com.zhxy.domain.Yuangongkaoqin;
import com.zhxy.service.sx.YuangongKaoQinService;

@Service
@Transactional
public class YuangongKaoQinServiceImpl implements YuangongKaoQinService{

	@Autowired
	YuangongkaoqinMapper  YuangongkaoqinMapper;
    @Autowired
    CpStaffMapper cpStaffMapper;
    @Autowired
    CpPositionMapper cpPositionMapper;
	@Override
	public List<Yuangongkaoqin> queryAllyg() {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.queryAllyg();
	}

	@Override
	public List<Yuangongkaoqin> queryByYuangongName(String ygName) {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.queryByYuangongName(ygName);
	}

	@Override
	public Yuangongkaoqin queryByYgId(Integer id) {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.queryByYgId(id);
	}

	@Override
	public List<Yuangongkaoqin> queryByYgNameAndStuStatus(Integer StuStatus, String name) {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.queryByYgNameAndStuStatus(StuStatus, name);
	}

	@Override
	public int updateYg(Integer id, Integer StuStatus) {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.updateYg(id, StuStatus);
	}

	@Override
	public Statuastype queryAllStatus(Integer id) {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.queryAllStatus(id);
	}

	@Override
	public CpPosition queryAllPosition(Integer id) {
		// TODO Auto-generated method stub
		return YuangongkaoqinMapper.queryAllPosition(id);
	}

	@Override
	public void batch() {
        final List<CpStaff> cpStaffs = cpStaffMapper.selectAll();
        final List<CpPosition> cpStaffList = cpPositionMapper.selectAll();
        List<Yuangongkaoqin> list = new ArrayList<>();

        for (int i = 0; i < cpStaffs.size(); i++) {
            Yuangongkaoqin yuangongkaoqin = new Yuangongkaoqin();
            yuangongkaoqin.setStaffid(cpStaffs.get(i).getStaffid());
            yuangongkaoqin.setDate(new Date());
            yuangongkaoqin.setKaoqinstatus(1);
            yuangongkaoqin.setPositionid(cpStaffList.get(i).getPositionid());
            list.add(yuangongkaoqin);
        }
        YuangongkaoqinMapper.insertForeach(list);
		
	}

}
