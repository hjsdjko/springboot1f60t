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


import com.dao.ShumataolunDao;
import com.entity.ShumataolunEntity;
import com.service.ShumataolunService;
import com.entity.vo.ShumataolunVO;
import com.entity.view.ShumataolunView;

@Service("shumataolunService")
public class ShumataolunServiceImpl extends ServiceImpl<ShumataolunDao, ShumataolunEntity> implements ShumataolunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShumataolunEntity> page = this.selectPage(
                new Query<ShumataolunEntity>(params).getPage(),
                new EntityWrapper<ShumataolunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShumataolunEntity> wrapper) {
		  Page<ShumataolunView> page =new Query<ShumataolunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShumataolunVO> selectListVO(Wrapper<ShumataolunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShumataolunVO selectVO(Wrapper<ShumataolunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShumataolunView> selectListView(Wrapper<ShumataolunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShumataolunView selectView(Wrapper<ShumataolunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
