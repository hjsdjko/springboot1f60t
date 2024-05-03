package com.dao;

import com.entity.DiscussshumataolunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshumataolunVO;
import com.entity.view.DiscussshumataolunView;


/**
 * 数码讨论评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
public interface DiscussshumataolunDao extends BaseMapper<DiscussshumataolunEntity> {
	
	List<DiscussshumataolunVO> selectListVO(@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);
	
	DiscussshumataolunVO selectVO(@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);
	
	List<DiscussshumataolunView> selectListView(@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);

	List<DiscussshumataolunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);
	
	DiscussshumataolunView selectView(@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);
	

}
