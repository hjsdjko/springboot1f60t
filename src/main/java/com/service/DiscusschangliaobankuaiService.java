package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschangliaobankuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschangliaobankuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschangliaobankuaiView;


/**
 * 畅聊板块评论表
 *
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
public interface DiscusschangliaobankuaiService extends IService<DiscusschangliaobankuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschangliaobankuaiVO> selectListVO(Wrapper<DiscusschangliaobankuaiEntity> wrapper);
   	
   	DiscusschangliaobankuaiVO selectVO(@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);
   	
   	List<DiscusschangliaobankuaiView> selectListView(Wrapper<DiscusschangliaobankuaiEntity> wrapper);
   	
   	DiscusschangliaobankuaiView selectView(@Param("ew") Wrapper<DiscusschangliaobankuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschangliaobankuaiEntity> wrapper);
   	

}

