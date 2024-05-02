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
 * 客户开发统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("kehukaifatongji")
public class KehukaifatongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KehukaifatongjiEntity() {
		
	}
	
	public KehukaifatongjiEntity(T t) {
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
	 * 客户编号
	 */
					
	private String kehubianhao;
	
	/**
	 * 所在公司
	 */
					
	private String suozaigongsi;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 开发度
	 */
					
	private String kaifadu;
	
	
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
	 * 设置：客户编号
	 */
	public void setKehubianhao(String kehubianhao) {
		this.kehubianhao = kehubianhao;
	}
	/**
	 * 获取：客户编号
	 */
	public String getKehubianhao() {
		return kehubianhao;
	}
	/**
	 * 设置：所在公司
	 */
	public void setSuozaigongsi(String suozaigongsi) {
		this.suozaigongsi = suozaigongsi;
	}
	/**
	 * 获取：所在公司
	 */
	public String getSuozaigongsi() {
		return suozaigongsi;
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
	 * 设置：开发度
	 */
	public void setKaifadu(String kaifadu) {
		this.kaifadu = kaifadu;
	}
	/**
	 * 获取：开发度
	 */
	public String getKaifadu() {
		return kaifadu;
	}

}
