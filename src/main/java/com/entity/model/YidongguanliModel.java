package com.entity.model;

import com.entity.YidongguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 异动管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class YidongguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
