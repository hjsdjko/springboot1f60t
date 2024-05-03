package com.dao;

import com.entity.ShumataolunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShumataolunVO;
import com.entity.view.ShumataolunView;


/**
 * 数码讨论
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ShumataolunDao extends BaseMapper<ShumataolunEntity> {
	
	List<ShumataolunVO> selectListVO(@Param("ew") Wrapper<ShumataolunEntity> wrapper);
	
	ShumataolunVO selectVO(@Param("ew") Wrapper<ShumataolunEntity> wrapper);
	
	List<ShumataolunView> selectListView(@Param("ew") Wrapper<ShumataolunEntity> wrapper);

	List<ShumataolunView> selectListView(Pagination page,@Param("ew") Wrapper<ShumataolunEntity> wrapper);
	
	ShumataolunView selectView(@Param("ew") Wrapper<ShumataolunEntity> wrapper);
	

}
