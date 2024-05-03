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


import com.dao.DiscussshumapingjiaDao;
import com.entity.DiscussshumapingjiaEntity;
import com.service.DiscussshumapingjiaService;
import com.entity.vo.DiscussshumapingjiaVO;
import com.entity.view.DiscussshumapingjiaView;

@Service("discussshumapingjiaService")
public class DiscussshumapingjiaServiceImpl extends ServiceImpl<DiscussshumapingjiaDao, DiscussshumapingjiaEntity> implements DiscussshumapingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshumapingjiaEntity> page = this.selectPage(
                new Query<DiscussshumapingjiaEntity>(params).getPage(),
                new EntityWrapper<DiscussshumapingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshumapingjiaEntity> wrapper) {
		  Page<DiscussshumapingjiaView> page =new Query<DiscussshumapingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshumapingjiaVO> selectListVO(Wrapper<DiscussshumapingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshumapingjiaVO selectVO(Wrapper<DiscussshumapingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshumapingjiaView> selectListView(Wrapper<DiscussshumapingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshumapingjiaView selectView(Wrapper<DiscussshumapingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
