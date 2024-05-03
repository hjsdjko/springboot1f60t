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


import com.dao.DiscussshumataolunDao;
import com.entity.DiscussshumataolunEntity;
import com.service.DiscussshumataolunService;
import com.entity.vo.DiscussshumataolunVO;
import com.entity.view.DiscussshumataolunView;

@Service("discussshumataolunService")
public class DiscussshumataolunServiceImpl extends ServiceImpl<DiscussshumataolunDao, DiscussshumataolunEntity> implements DiscussshumataolunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshumataolunEntity> page = this.selectPage(
                new Query<DiscussshumataolunEntity>(params).getPage(),
                new EntityWrapper<DiscussshumataolunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshumataolunEntity> wrapper) {
		  Page<DiscussshumataolunView> page =new Query<DiscussshumataolunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshumataolunVO> selectListVO(Wrapper<DiscussshumataolunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshumataolunVO selectVO(Wrapper<DiscussshumataolunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshumataolunView> selectListView(Wrapper<DiscussshumataolunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshumataolunView selectView(Wrapper<DiscussshumataolunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
