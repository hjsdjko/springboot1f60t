package com.dao;

import com.entity.DiscusschangliaobankuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschangliaobankuaiVO;
import com.entity.view.DiscusschangliaobankuaiView;


/**
 * 畅聊板块评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
public interface DiscusschangliaobankuaiDao extends BaseMapper<DiscusschangliaobankuaiEntity> {
	
	List<DiscusschangliaobankuaiVO> selectListVO(@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);
	
	DiscusschangliaobankuaiVO selectVO(@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);
	
	List<DiscusschangliaobankuaiView> selectListView(@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);

	List<DiscusschangliaobankuaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);
	
	DiscusschangliaobankuaiView selectView(@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);
	

}
