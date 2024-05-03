package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshumataolunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshumataolunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshumataolunView;


/**
 * 数码讨论评论表
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
public interface DiscussshumataolunService extends IService<DiscussshumataolunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshumataolunVO> selectListVO(Wrapper<DiscussshumataolunEntity> wrapper);
   	
   	DiscussshumataolunVO selectVO(@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);
   	
   	List<DiscussshumataolunView> selectListView(Wrapper<DiscussshumataolunEntity> wrapper);
   	
   	DiscussshumataolunView selectView(@Param("ew") Wrapper<DiscussshumataolunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshumataolunEntity> wrapper);
   	

}

