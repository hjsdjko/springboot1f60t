package com.dao;

import com.entity.ShumabankuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShumabankuaiVO;
import com.entity.view.ShumabankuaiView;


/**
 * 数码板块
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ShumabankuaiDao extends BaseMapper<ShumabankuaiEntity> {
	
	List<ShumabankuaiVO> selectListVO(@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);
	
	ShumabankuaiVO selectVO(@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);
	
	List<ShumabankuaiView> selectListView(@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);

	List<ShumabankuaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);
	
	ShumabankuaiView selectView(@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);
	

}
