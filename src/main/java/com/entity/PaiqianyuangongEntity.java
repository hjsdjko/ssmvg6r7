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
 * 派遣员工
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("paiqianyuangong")
public class PaiqianyuangongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PaiqianyuangongEntity() {
		
	}
	
	public PaiqianyuangongEntity(T t) {
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
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 原公司
	 */
					
	private String yuangongsi;
	
	/**
	 * 派遣公司
	 */
					
	private String paiqiangongsi;
	
	/**
	 * 派遣时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date paiqianshijian;
	
	
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
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
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
	 * 设置：派遣公司
	 */
	public void setPaiqiangongsi(String paiqiangongsi) {
		this.paiqiangongsi = paiqiangongsi;
	}
	/**
	 * 获取：派遣公司
	 */
	public String getPaiqiangongsi() {
		return paiqiangongsi;
	}
	/**
	 * 设置：派遣时间
	 */
	public void setPaiqianshijian(Date paiqianshijian) {
		this.paiqianshijian = paiqianshijian;
	}
	/**
	 * 获取：派遣时间
	 */
	public Date getPaiqianshijian() {
		return paiqianshijian;
	}

}
