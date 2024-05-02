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
 * 招聘信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("zhaopinxinxi")
public class ZhaopinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhaopinxinxiEntity() {
		
	}
	
	public ZhaopinxinxiEntity(T t) {
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
	 * 招聘公司
	 */
					
	private String zhaopingongsi;
	
	/**
	 * 招聘职位
	 */
					
	private String zhaopinzhiwei;
	
	/**
	 * 招聘人数
	 */
					
	private Integer zhaopinrenshu;
	
	/**
	 * 职位介绍
	 */
					
	private String zhiweijieshao;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 投递邮箱
	 */
					
	private String toudiyouxiang;
	
	
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
	 * 设置：招聘公司
	 */
	public void setZhaopingongsi(String zhaopingongsi) {
		this.zhaopingongsi = zhaopingongsi;
	}
	/**
	 * 获取：招聘公司
	 */
	public String getZhaopingongsi() {
		return zhaopingongsi;
	}
	/**
	 * 设置：招聘职位
	 */
	public void setZhaopinzhiwei(String zhaopinzhiwei) {
		this.zhaopinzhiwei = zhaopinzhiwei;
	}
	/**
	 * 获取：招聘职位
	 */
	public String getZhaopinzhiwei() {
		return zhaopinzhiwei;
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
	 * 设置：职位介绍
	 */
	public void setZhiweijieshao(String zhiweijieshao) {
		this.zhiweijieshao = zhiweijieshao;
	}
	/**
	 * 获取：职位介绍
	 */
	public String getZhiweijieshao() {
		return zhiweijieshao;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：投递邮箱
	 */
	public void setToudiyouxiang(String toudiyouxiang) {
		this.toudiyouxiang = toudiyouxiang;
	}
	/**
	 * 获取：投递邮箱
	 */
	public String getToudiyouxiang() {
		return toudiyouxiang;
	}

}
