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
 * 数码板块
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
@TableName("shumabankuai")
public class ShumabankuaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShumabankuaiEntity() {
		
	}
	
	public ShumabankuaiEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
