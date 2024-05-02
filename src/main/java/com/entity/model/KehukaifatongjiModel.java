package com.entity.model;

import com.entity.KehukaifatongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 客户开发统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class KehukaifatongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
