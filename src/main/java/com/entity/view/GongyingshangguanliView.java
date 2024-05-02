package com.entity.view;

import com.entity.GongyingshangguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 供应商管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("gongyingshangguanli")
public class GongyingshangguanliView  extends GongyingshangguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongyingshangguanliView(){
	}
 
 	public GongyingshangguanliView(GongyingshangguanliEntity gongyingshangguanliEntity){
 	try {
			BeanUtils.copyProperties(this, gongyingshangguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
