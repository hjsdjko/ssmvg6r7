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
 * 供应商管理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("gongyingshangguanli")
public class GongyingshangguanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongyingshangguanliEntity() {
		
	}
	
	public GongyingshangguanliEntity(T t) {
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
	 * 供应商名称
	 */
					
	private String gongyingshangmingcheng;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 员工人数
	 */
					
	private Integer yuangongrenshu;
	
	/**
	 * 员工薪酬
	 */
					
	private String yuangongxinchou;
	
	/**
	 * 招聘岗位
	 */
					
	private String zhaopingangwei;
	
	/**
	 * 招聘人数
	 */
					
	private Integer zhaopinrenshu;
	
	/**
	 * 招聘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhaopinshijian;
	
	
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
	 * 设置：供应商名称
	 */
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：员工人数
	 */
	public void setYuangongrenshu(Integer yuangongrenshu) {
		this.yuangongrenshu = yuangongrenshu;
	}
	/**
	 * 获取：员工人数
	 */
	public Integer getYuangongrenshu() {
		return yuangongrenshu;
	}
	/**
	 * 设置：员工薪酬
	 */
	public void setYuangongxinchou(String yuangongxinchou) {
		this.yuangongxinchou = yuangongxinchou;
	}
	/**
	 * 获取：员工薪酬
	 */
	public String getYuangongxinchou() {
		return yuangongxinchou;
	}
	/**
	 * 设置：招聘岗位
	 */
	public void setZhaopingangwei(String zhaopingangwei) {
		this.zhaopingangwei = zhaopingangwei;
	}
	/**
	 * 获取：招聘岗位
	 */
	public String getZhaopingangwei() {
		return zhaopingangwei;
	}
	/**
	 * 设置：招聘人数
	 */
	public void setZhaopinrenshu(Integer zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	/**
	 * 获取：招聘人数
	 */
	public Integer getZhaopinrenshu() {
		return zhaopinrenshu;
	}
	/**
	 * 设置：招聘时间
	 */
	public void setZhaopinshijian(Date zhaopinshijian) {
		this.zhaopinshijian = zhaopinshijian;
	}
	/**
	 * 获取：招聘时间
	 */
	public Date getZhaopinshijian() {
		return zhaopinshijian;
	}

}
