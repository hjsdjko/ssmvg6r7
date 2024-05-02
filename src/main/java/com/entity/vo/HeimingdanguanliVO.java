package com.entity.vo;

import com.entity.HeimingdanguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 黑名单管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class HeimingdanguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 拉黑时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date laheishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：拉黑时间
	 */
	 
	public void setLaheishijian(Date laheishijian) {
		this.laheishijian = laheishijian;
	}
	
	/**
	 * 获取：拉黑时间
	 */
	public Date getLaheishijian() {
		return laheishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
