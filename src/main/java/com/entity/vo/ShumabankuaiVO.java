package com.entity.vo;

import com.entity.ShumabankuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 数码板块
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public class ShumabankuaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品图片
	 */
	
	private String chanpintupian;
		
	/**
	 * 综合评分
	 */
	
	private Float zonghepingfen;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 产品定位
	 */
	
	private String chanpindingwei;
		
	/**
	 * 上市时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangshishijian;
		
	/**
	 * 配置详情
	 */
	
	private String peizhixiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：产品图片
	 */
	 
	public void setChanpintupian(String chanpintupian) {
		this.chanpintupian = chanpintupian;
	}
	
	/**
	 * 获取：产品图片
	 */
	public String getChanpintupian() {
		return chanpintupian;
	}
				
	
	/**
	 * 设置：综合评分
	 */
	 
	public void setZonghepingfen(Float zonghepingfen) {
		this.zonghepingfen = zonghepingfen;
	}
	
	/**
	 * 获取：综合评分
	 */
	public Float getZonghepingfen() {
		return zonghepingfen;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：产品定位
	 */
	 
	public void setChanpindingwei(String chanpindingwei) {
		this.chanpindingwei = chanpindingwei;
	}
	
	/**
	 * 获取：产品定位
	 */
	public String getChanpindingwei() {
		return chanpindingwei;
	}
				
	
	/**
	 * 设置：上市时间
	 */
	 
	public void setShangshishijian(Date shangshishijian) {
		this.shangshishijian = shangshishijian;
	}
	
	/**
	 * 获取：上市时间
	 */
	public Date getShangshishijian() {
		return shangshishijian;
	}
				
	
	/**
	 * 设置：配置详情
	 */
	 
	public void setPeizhixiangqing(String peizhixiangqing) {
		this.peizhixiangqing = peizhixiangqing;
	}
	
	/**
	 * 获取：配置详情
	 */
	public String getPeizhixiangqing() {
		return peizhixiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
