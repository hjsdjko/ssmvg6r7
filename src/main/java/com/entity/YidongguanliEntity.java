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
 * 异动管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("yidongguanli")
public class YidongguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YidongguanliEntity() {
		
	}
	
	public YidongguanliEntity(T t) {
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
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 原公司
	 */
					
	private String yuangongsi;
	
	/**
	 * 原职位
	 */
					
	private String yuanzhiwei;
	
	/**
	 * 原部门
	 */
					
	private String yuanbumen;
	
	/**
	 * 调动公司
	 */
					
	private String diaodonggongsi;
	
	/**
	 * 调动职位
	 */
					
	private String diaodongzhiwei;
	
	/**
	 * 调动部门
	 */
					
	private String diaodongbumen;
	
	/**
	 * 调动时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date diaodongshijian;
	
	
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
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：原公司
	 */
	public void setYuangongsi(String yuangongsi) {
		this.yuangongsi = yuangongsi;
	}
	/**
	 * 获取：原公司
	 */
	public String getYuangongsi() {
		return yuangongsi;
	}
	/**
	 * 设置：原职位
	 */
	public void setYuanzhiwei(String yuanzhiwei) {
		this.yuanzhiwei = yuanzhiwei;
	}
	/**
	 * 获取：原职位
	 */
	public String getYuanzhiwei() {
		return yuanzhiwei;
	}
	/**
	 * 设置：原部门
	 */
	public void setYuanbumen(String yuanbumen) {
		this.yuanbumen = yuanbumen;
	}
	/**
	 * 获取：原部门
	 */
	public String getYuanbumen() {
		return yuanbumen;
	}
	/**
	 * 设置：调动公司
	 */
	public void setDiaodonggongsi(String diaodonggongsi) {
		this.diaodonggongsi = diaodonggongsi;
	}
	/**
	 * 获取：调动公司
	 */
	public String getDiaodonggongsi() {
		return diaodonggongsi;
	}
	/**
	 * 设置：调动职位
	 */
	public void setDiaodongzhiwei(String diaodongzhiwei) {
		this.diaodongzhiwei = diaodongzhiwei;
	}
	/**
	 * 获取：调动职位
	 */
	public String getDiaodongzhiwei() {
		return diaodongzhiwei;
	}
	/**
	 * 设置：调动部门
	 */
	public void setDiaodongbumen(String diaodongbumen) {
		this.diaodongbumen = diaodongbumen;
	}
	/**
	 * 获取：调动部门
	 */
	public String getDiaodongbumen() {
		return diaodongbumen;
	}
	/**
	 * 设置：调动时间
	 */
	public void setDiaodongshijian(Date diaodongshijian) {
		this.diaodongshijian = diaodongshijian;
	}
	/**
	 * 获取：调动时间
	 */
	public Date getDiaodongshijian() {
		return diaodongshijian;
	}

}
