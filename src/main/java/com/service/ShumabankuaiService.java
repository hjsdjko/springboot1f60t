package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShumabankuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShumabankuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShumabankuaiView;


/**
 * 数码板块
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ShumabankuaiService extends IService<ShumabankuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShumabankuaiVO> selectListVO(Wrapper<ShumabankuaiEntity> wrapper);
   	
   	ShumabankuaiVO selectVO(@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);
   	
   	List<ShumabankuaiView> selectListView(Wrapper<ShumabankuaiEntity> wrapper);
   	
   	ShumabankuaiView selectView(@Param("ew") Wrapper<ShumabankuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShumabankuaiEntity> wrapper);
   	

}

