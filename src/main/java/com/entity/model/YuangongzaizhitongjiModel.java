package com.entity.model;

import com.entity.YuangongzaizhitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工在职统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class YuangongzaizhitongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位
	 */
	
	private String gangwei;
		
	/**
	 * 在职状态
	 */
	
	private String zaizhizhuangtai;
				
	
	/**
	 * 设置：岗位
	 */
	 
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	
	/**
	 * 获取：岗位
	 */
	public String getGangwei() {
		return gangwei;
	}
				
	
	/**
	 * 设置：在职状态
	 */
	 
	public void setZaizhizhuangtai(String zaizhizhuangtai) {
		this.zaizhizhuangtai = zaizhizhuangtai;
	}
	
	/**
	 * 获取：在职状态
	 */
	public String getZaizhizhuangtai() {
		return zaizhizhuangtai;
	}
			
}
