package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshumapingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshumapingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshumapingjiaView;


/**
 * 数码评价评论表
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
public interface DiscussshumapingjiaService extends IService<DiscussshumapingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshumapingjiaVO> selectListVO(Wrapper<DiscussshumapingjiaEntity> wrapper);
   	
   	DiscussshumapingjiaVO selectVO(@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);
   	
   	List<DiscussshumapingjiaView> selectListView(Wrapper<DiscussshumapingjiaEntity> wrapper);
   	
   	DiscussshumapingjiaView selectView(@Param("ew") Wrapper<DiscussshumapingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshumapingjiaEntity> wrapper);
   	

}

