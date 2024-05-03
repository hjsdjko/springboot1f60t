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


import com.dao.DiscusschangliaobankuaiDao;
import com.entity.DiscusschangliaobankuaiEntity;
import com.service.DiscusschangliaobankuaiService;
import com.entity.vo.DiscusschangliaobankuaiVO;
import com.entity.view.DiscusschangliaobankuaiView;

@Service("discusschangliaobankuaiService")
public class DiscusschangliaobankuaiServiceImpl extends ServiceImpl<DiscusschangliaobankuaiDao, DiscusschangliaobankuaiEntity> implements DiscusschangliaobankuaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschangliaobankuaiEntity> page = this.selectPage(
                new Query<DiscusschangliaobankuaiEntity>(params).getPage(),
                new EntityWrapper<DiscusschangliaobankuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschangliaobankuaiEntity> wrapper) {
		  Page<DiscusschangliaobankuaiView> page =new Query<DiscusschangliaobankuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschangliaobankuaiVO> selectListVO(Wrapper<DiscusschangliaobankuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschangliaobankuaiVO selectVO(Wrapper<DiscusschangliaobankuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschangliaobankuaiView> selectListView(Wrapper<DiscusschangliaobankuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschangliaobankuaiView selectView(Wrapper<DiscusschangliaobankuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
