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
 * 用工单位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("yonggongdanwei")
public class YonggongdanweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonggongdanweiEntity() {
		
	}
	
	public YonggongdanweiEntity(T t) {
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
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 单位负责人
	 */
					
	private String danweifuzeren;
	
	/**
	 * 员工人数
	 */
					
	private String yuangongrenshu;
	
	/**
	 * 员工名单
	 */
					
	private String yuangongmingdan;
	
	/**
	 * 发票凭证
	 */
					
	private String fapiaopingzheng;
	
	
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
	 * 设置：单位名称
	 */
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
	/**
	 * 设置：单位负责人
	 */
	public void setDanweifuzeren(String danweifuzeren) {
		this.danweifuzeren = danweifuzeren;
	}
	/**
	 * 获取：单位负责人
	 */
	public String getDanweifuzeren() {
		return danweifuzeren;
	}
	/**
	 * 设置：员工人数
	 */
	public void setYuangongrenshu(String yuangongrenshu) {
		this.yuangongrenshu = yuangongrenshu;
	}
	/**
	 * 获取：员工人数
	 */
	public String getYuangongrenshu() {
		return yuangongrenshu;
	}
	/**
	 * 设置：员工名单
	 */
	public void setYuangongmingdan(String yuangongmingdan) {
		this.yuangongmingdan = yuangongmingdan;
	}
	/**
	 * 获取：员工名单
	 */
	public String getYuangongmingdan() {
		return yuangongmingdan;
	}
	/**
	 * 设置：发票凭证
	 */
	public void setFapiaopingzheng(String fapiaopingzheng) {
		this.fapiaopingzheng = fapiaopingzheng;
	}
	/**
	 * 获取：发票凭证
	 */
	public String getFapiaopingzheng() {
		return fapiaopingzheng;
	}

}
