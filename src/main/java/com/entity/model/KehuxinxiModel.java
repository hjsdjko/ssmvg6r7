package com.entity.model;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 客户信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public class KehuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所在公司
	 */
	
	private String suozaigongsi;
		
	/**
	 * 客户类型
	 */
	
	private String kehuleixing;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 拜访时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baifangshijian;
		
	/**
	 * 公司地址
	 */
	
	private String gongsidizhi;
		
	/**
	 * 公司封面
	 */
	
	private String gongsifengmian;
		
	/**
	 * 客户介绍
	 */
	
	private String kehujieshao;
		
	/**
	 * 业务员账号
	 */
	
	private String yewuyuanzhanghao;
		
	/**
	 * 业务员姓名
	 */
	
	private String yewuyuanxingming;
		
	/**
	 * 电话联系次数
	 */
	
	private String dianhualianxicishu;
		
	/**
	 * 出差记录
	 */
	
	private String chuchajilu;
		
	/**
	 * 拜访记录
	 */
	
	private String baifangjilu;
				
	
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
	 * 设置：客户类型
	 */
	 
	public void setKehuleixing(String kehuleixing) {
		this.kehuleixing = kehuleixing;
	}
	
	/**
	 * 获取：客户类型
	 */
	public String getKehuleixing() {
		return kehuleixing;
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
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：拜访时间
	 */
	 
	public void setBaifangshijian(Date baifangshijian) {
		this.baifangshijian = baifangshijian;
	}
	
	/**
	 * 获取：拜访时间
	 */
	public Date getBaifangshijian() {
		return baifangshijian;
	}
				
	
	/**
	 * 设置：公司地址
	 */
	 
	public void setGongsidizhi(String gongsidizhi) {
		this.gongsidizhi = gongsidizhi;
	}
	
	/**
	 * 获取：公司地址
	 */
	public String getGongsidizhi() {
		return gongsidizhi;
	}
				
	
	/**
	 * 设置：公司封面
	 */
	 
	public void setGongsifengmian(String gongsifengmian) {
		this.gongsifengmian = gongsifengmian;
	}
	
	/**
	 * 获取：公司封面
	 */
	public String getGongsifengmian() {
		return gongsifengmian;
	}
				
	
	/**
	 * 设置：客户介绍
	 */
	 
	public void setKehujieshao(String kehujieshao) {
		this.kehujieshao = kehujieshao;
	}
	
	/**
	 * 获取：客户介绍
	 */
	public String getKehujieshao() {
		return kehujieshao;
	}
				
	
	/**
	 * 设置：业务员账号
	 */
	 
	public void setYewuyuanzhanghao(String yewuyuanzhanghao) {
		this.yewuyuanzhanghao = yewuyuanzhanghao;
	}
	
	/**
	 * 获取：业务员账号
	 */
	public String getYewuyuanzhanghao() {
		return yewuyuanzhanghao;
	}
				
	
	/**
	 * 设置：业务员姓名
	 */
	 
	public void setYewuyuanxingming(String yewuyuanxingming) {
		this.yewuyuanxingming = yewuyuanxingming;
	}
	
	/**
	 * 获取：业务员姓名
	 */
	public String getYewuyuanxingming() {
		return yewuyuanxingming;
	}
				
	
	/**
	 * 设置：电话联系次数
	 */
	 
	public void setDianhualianxicishu(String dianhualianxicishu) {
		this.dianhualianxicishu = dianhualianxicishu;
	}
	
	/**
	 * 获取：电话联系次数
	 */
	public String getDianhualianxicishu() {
		return dianhualianxicishu;
	}
				
	
	/**
	 * 设置：出差记录
	 */
	 
	public void setChuchajilu(String chuchajilu) {
		this.chuchajilu = chuchajilu;
	}
	
	/**
	 * 获取：出差记录
	 */
	public String getChuchajilu() {
		return chuchajilu;
	}
				
	
	/**
	 * 设置：拜访记录
	 */
	 
	public void setBaifangjilu(String baifangjilu) {
		this.baifangjilu = baifangjilu;
	}
	
	/**
	 * 获取：拜访记录
	 */
	public String getBaifangjilu() {
		return baifangjilu;
	}
			
}
