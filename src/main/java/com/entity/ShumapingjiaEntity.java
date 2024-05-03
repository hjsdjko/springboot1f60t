package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 数码评价
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
@TableName("shumapingjia")
public class ShumapingjiaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShumapingjiaEntity() {
		
	}
	
	public ShumapingjiaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：产品名称
	 */
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
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
