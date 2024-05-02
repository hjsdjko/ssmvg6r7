package com.entity.model;

import com.entity.HetongguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 合同管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class HetongguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
		
	/**
	 * 合同内容
	 */
	
	private String hetongneirong;
		
	/**
	 * 签订时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiandingshijian;
		
	/**
	 * 合同有效期
	 */
	
	private String hetongyouxiaoqi;
		
	/**
	 * 到期日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daoqiriqi;
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
				
	
	/**
	 * 设置：合同内容
	 */
	 
	public void setHetongneirong(String hetongneirong) {
		this.hetongneirong = hetongneirong;
	}
	
	/**
	 * 获取：合同内容
	 */
	public String getHetongneirong() {
		return hetongneirong;
	}
				
	
	/**
	 * 设置：签订时间
	 */
	 
	public void setQiandingshijian(Date qiandingshijian) {
		this.qiandingshijian = qiandingshijian;
	}
	
	/**
	 * 获取：签订时间
	 */
	public Date getQiandingshijian() {
		return qiandingshijian;
	}
				
	
	/**
	 * 设置：合同有效期
	 */
	 
	public void setHetongyouxiaoqi(String hetongyouxiaoqi) {
		this.hetongyouxiaoqi = hetongyouxiaoqi;
	}
	
	/**
	 * 获取：合同有效期
	 */
	public String getHetongyouxiaoqi() {
		return hetongyouxiaoqi;
	}
				
	
	/**
	 * 设置：到期日期
	 */
	 
	public void setDaoqiriqi(Date daoqiriqi) {
		this.daoqiriqi = daoqiriqi;
	}
	
	/**
	 * 获取：到期日期
	 */
	public Date getDaoqiriqi() {
		return daoqiriqi;
	}
			
}
