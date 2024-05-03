package com.entity.view;

import com.entity.DiscusschangliaobankuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 畅聊板块评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
@TableName("discusschangliaobankuai")
public class DiscusschangliaobankuaiView  extends DiscusschangliaobankuaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschangliaobankuaiView(){
	}
 
 	public DiscusschangliaobankuaiView(DiscusschangliaobankuaiEntity discusschangliaobankuaiEntity){
 	try {
			BeanUtils.copyProperties(this, discusschangliaobankuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
