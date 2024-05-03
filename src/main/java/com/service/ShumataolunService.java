package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShumataolunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShumataolunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShumataolunView;


/**
 * 数码讨论
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ShumataolunService extends IService<ShumataolunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShumataolunVO> selectListVO(Wrapper<ShumataolunEntity> wrapper);
   	
   	ShumataolunVO selectVO(@Param("ew") Wrapper<ShumataolunEntity> wrapper);
   	
   	List<ShumataolunView> selectListView(Wrapper<ShumataolunEntity> wrapper);
   	
   	ShumataolunView selectView(@Param("ew") Wrapper<ShumataolunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShumataolunEntity> wrapper);
   	

}

