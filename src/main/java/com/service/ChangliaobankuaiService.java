package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangliaobankuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangliaobankuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangliaobankuaiView;


/**
 * 畅聊板块
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public interface ChangliaobankuaiService extends IService<ChangliaobankuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangliaobankuaiVO> selectListVO(Wrapper<ChangliaobankuaiEntity> wrapper);
   	
   	ChangliaobankuaiVO selectVO(@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);
   	
   	List<ChangliaobankuaiView> selectListView(Wrapper<ChangliaobankuaiEntity> wrapper);
   	
   	ChangliaobankuaiView selectView(@Param("ew") Wrapper<ChangliaobankuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangliaobankuaiEntity> wrapper);
   	

}

