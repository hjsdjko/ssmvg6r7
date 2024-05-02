package com.entity.vo;

import com.entity.ZhaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 招聘信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class ZhaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
