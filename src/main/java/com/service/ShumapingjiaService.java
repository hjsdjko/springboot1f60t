package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShumapingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShumapingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShumapingjiaView;


/**
 * 数码评价
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ShumapingjiaService extends IService<ShumapingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShumapingjiaVO> selectListVO(Wrapper<ShumapingjiaEntity> wrapper);
   	
   	ShumapingjiaVO selectVO(@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);
   	
   	List<ShumapingjiaView> selectListView(Wrapper<ShumapingjiaEntity> wrapper);
   	
   	ShumapingjiaView selectView(@Param("ew") Wrapper<ShumapingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShumapingjiaEntity> wrapper);
   	

}

