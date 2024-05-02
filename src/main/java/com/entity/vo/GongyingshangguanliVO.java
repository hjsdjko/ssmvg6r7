package com.entity.vo;

import com.entity.GongyingshangguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 供应商管理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class GongyingshangguanliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhaopinshijian;
				
	
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
