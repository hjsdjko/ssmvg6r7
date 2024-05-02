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
 * 合同管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("hetongguanli")
public class HetongguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HetongguanliEntity() {
		
	}
	
	public HetongguanliEntity(T t) {
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
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 公司名称
	 */
					
	private String gongsimingcheng;
	
	/**
	 * 合同内容
	 */
					
	private String hetongneirong;
	
	/**
	 * 签订时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date qiandingshijian;
	
	/**
	 * 合同有效期
	 */
					
	private String hetongyouxiaoqi;
	
	/**
	 * 到期日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date daoqiriqi;
	
	
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：公司名称
	 */
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
	/**
	 * 设置：合同内容
	 */
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
	/**
	 * 设置：签订时间
	 */
	public void setQiandingshijian(Date qiandingshijian) {
		this.qiandingshijian = qiandingshijian;
	}
	/**
	 * 获取：签订时间
	 */
	public Date getQiandingshijian() {
		return qiandingshijian;
	}
	/**
	 * 设置：合同有效期
	 */
	public void setHetongyouxiaoqi(String hetongyouxiaoqi) {
		this.hetongyouxiaoqi = hetongyouxiaoqi;
	}
	/**
	 * 获取：合同有效期
	 */
	public String getHetongyouxiaoqi() {
		return hetongyouxiaoqi;
	}
	/**
	 * 设置：到期日期
	 */
	public void setDaoqiriqi(Date daoqiriqi) {
		this.daoqiriqi = daoqiriqi;
	}
	/**
	 * 获取：到期日期
	 */
	public Date getDaoqiriqi() {
		return daoqiriqi;
	}

}
