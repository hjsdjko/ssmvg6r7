package com.entity.model;

import com.entity.YonggongdanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用工单位
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class YonggongdanweiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单位负责人
	 */
	
	private String danweifuzeren;
		
	/**
	 * 员工人数
	 */
	
	private String yuangongrenshu;
		
	/**
	 * 员工名单
	 */
	
	private String yuangongmingdan;
		
	/**
	 * 发票凭证
	 */
	
	private String fapiaopingzheng;
				
	
	/**
	 * 设置：单位负责人
	 */
	 
	public void setDanweifuzeren(String danweifuzeren) {
		this.danweifuzeren = danweifuzeren;
	}
	
	/**
	 * 获取：单位负责人
	 */
	public String getDanweifuzeren() {
		return danweifuzeren;
	}
				
	
	/**
	 * 设置：员工人数
	 */
	 
	public void setYuangongrenshu(String yuangongrenshu) {
		this.yuangongrenshu = yuangongrenshu;
	}
	
	/**
	 * 获取：员工人数
	 */
	public String getYuangongrenshu() {
		return yuangongrenshu;
	}
				
	
	/**
	 * 设置：员工名单
	 */
	 
	public void setYuangongmingdan(String yuangongmingdan) {
		this.yuangongmingdan = yuangongmingdan;
	}
	
	/**
	 * 获取：员工名单
	 */
	public String getYuangongmingdan() {
		return yuangongmingdan;
	}
				
	
	/**
	 * 设置：发票凭证
	 */
	 
	public void setFapiaopingzheng(String fapiaopingzheng) {
		this.fapiaopingzheng = fapiaopingzheng;
	}
	
	/**
	 * 获取：发票凭证
	 */
	public String getFapiaopingzheng() {
		return fapiaopingzheng;
	}
			
}
