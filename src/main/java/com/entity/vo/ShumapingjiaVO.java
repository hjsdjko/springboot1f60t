package com.entity.vo;

import com.entity.ShumapingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 数码评价
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
public class ShumapingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 产品图片
	 */
	
	private String chanpintupian;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 评分
	 */
	
	private Float pingfen;
		
	/**
	 * 优点
	 */
	
	private String youdian;
		
	/**
	 * 缺点
	 */
	
	private String quedian;
		
	/**
	 * 总结
	 */
	
	private String zongjie;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
				
	
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
	 * 设置：评分
	 */
	 
	public void setPingfen(Float pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public Float getPingfen() {
		return pingfen;
	}
				
	
	/**
	 * 设置：优点
	 */
	 
	public void setYoudian(String youdian) {
		this.youdian = youdian;
	}
	
	/**
	 * 获取：优点
	 */
	public String getYoudian() {
		return youdian;
	}
				
	
	/**
	 * 设置：缺点
	 */
	 
	public void setQuedian(String quedian) {
		this.quedian = quedian;
	}
	
	/**
	 * 获取：缺点
	 */
	public String getQuedian() {
		return quedian;
	}
				
	
	/**
	 * 设置：总结
	 */
	 
	public void setZongjie(String zongjie) {
		this.zongjie = zongjie;
	}
	
	/**
	 * 获取：总结
	 */
	public String getZongjie() {
		return zongjie;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
	}
			
}
