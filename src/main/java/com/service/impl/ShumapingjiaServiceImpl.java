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


import com.dao.ShumapingjiaDao;
import com.entity.ShumapingjiaEntity;
import com.service.ShumapingjiaService;
import com.entity.vo.ShumapingjiaVO;
import com.entity.view.ShumapingjiaView;

@Service("shumapingjiaService")
public class ShumapingjiaServiceImpl extends ServiceImpl<ShumapingjiaDao, ShumapingjiaEntity> implements ShumapingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShumapingjiaEntity> page = this.selectPage(
                new Query<ShumapingjiaEntity>(params).getPage(),
                new EntityWrapper<ShumapingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShumapingjiaEntity> wrapper) {
		  Page<ShumapingjiaView> page =new Query<ShumapingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShumapingjiaVO> selectListVO(Wrapper<ShumapingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShumapingjiaVO selectVO(Wrapper<ShumapingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShumapingjiaView> selectListView(Wrapper<ShumapingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShumapingjiaView selectView(Wrapper<ShumapingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
