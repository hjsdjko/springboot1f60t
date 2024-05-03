package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChangliaobankuaiDao;
import com.entity.ChangliaobankuaiEntity;
import com.service.ChangliaobankuaiService;
import com.entity.vo.ChangliaobankuaiVO;
import com.entity.view.ChangliaobankuaiView;

@Service("changliaobankuaiService")
public class ChangliaobankuaiServiceImpl extends ServiceImpl<ChangliaobankuaiDao, ChangliaobankuaiEntity> implements ChangliaobankuaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangliaobankuaiEntity> page = this.selectPage(
                new Query<ChangliaobankuaiEntity>(params).getPage(),
                new EntityWrapper<ChangliaobankuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangliaobankuaiEntity> wrapper) {
		  Page<ChangliaobankuaiView> page =new Query<ChangliaobankuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangliaobankuaiVO> selectListVO(Wrapper<ChangliaobankuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangliaobankuaiVO selectVO(Wrapper<ChangliaobankuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangliaobankuaiView> selectListView(Wrapper<ChangliaobankuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangliaobankuaiView selectView(Wrapper<ChangliaobankuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
