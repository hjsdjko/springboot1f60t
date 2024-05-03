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


import com.dao.ShumabankuaiDao;
import com.entity.ShumabankuaiEntity;
import com.service.ShumabankuaiService;
import com.entity.vo.ShumabankuaiVO;
import com.entity.view.ShumabankuaiView;

@Service("shumabankuaiService")
public class ShumabankuaiServiceImpl extends ServiceImpl<ShumabankuaiDao, ShumabankuaiEntity> implements ShumabankuaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShumabankuaiEntity> page = this.selectPage(
                new Query<ShumabankuaiEntity>(params).getPage(),
                new EntityWrapper<ShumabankuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShumabankuaiEntity> wrapper) {
		  Page<ShumabankuaiView> page =new Query<ShumabankuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShumabankuaiVO> selectListVO(Wrapper<ShumabankuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShumabankuaiVO selectVO(Wrapper<ShumabankuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShumabankuaiView> selectListView(Wrapper<ShumabankuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShumabankuaiView selectView(Wrapper<ShumabankuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
