package com.dao;

import com.entity.ChangliaobankuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangliaobankuaiVO;
import com.entity.view.ChangliaobankuaiView;


/**
 * 畅聊板块
 * 
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ChangliaobankuaiDao extends BaseMapper<ChangliaobankuaiEntity> {
	
	List<ChangliaobankuaiVO> selectListVO(@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);
	
	ChangliaobankuaiVO selectVO(@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);
	
	List<ChangliaobankuaiView> selectListView(@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);

	List<ChangliaobankuaiView> selectListView(Pagination page,@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);
	
	ChangliaobankuaiView selectView(@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);
	

}
