package com.entity.vo;

import com.entity.PaiqianyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 派遣员工
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class PaiqianyuangongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
