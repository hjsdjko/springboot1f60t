package com.entity.view;

import com.entity.DiscussshumataolunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 数码讨论评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-22 15:52:54
 */
@TableName("discussshumataolun")
public class DiscussshumataolunView  extends DiscussshumataolunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshumataolunView(){
	}
 
 	public DiscussshumataolunView(DiscussshumataolunEntity discussshumataolunEntity){
 	try {
			BeanUtils.copyProperties(this, discussshumataolunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
