package com.dao;

import com.entity.ShumapingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShumapingjiaVO;
import com.entity.view.ShumapingjiaView;


/**
 * 数码评价
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ShumapingjiaDao extends BaseMapper<ShumapingjiaEntity> {
	
	List<ShumapingjiaVO> selectListVO(@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);
	
	ShumapingjiaVO selectVO(@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);
	
	List<ShumapingjiaView> selectListView(@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);

	List<ShumapingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);
	
	ShumapingjiaView selectView(@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);
	

}
