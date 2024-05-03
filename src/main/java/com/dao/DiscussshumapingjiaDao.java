package com.dao;

import com.entity.DiscussshumapingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshumapingjiaVO;
import com.entity.view.DiscussshumapingjiaView;


/**
 * 数码评价评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
public interface DiscussshumapingjiaDao extends BaseMapper<DiscussshumapingjiaEntity> {
	
	List<DiscussshumapingjiaVO> selectListVO(@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);
	
	DiscussshumapingjiaVO selectVO(@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);
	
	List<DiscussshumapingjiaView> selectListView(@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);

	List<DiscussshumapingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);
	
	DiscussshumapingjiaView selectView(@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);
	

}
