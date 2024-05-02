package com.entity.view;

import com.entity.HetongguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 合同管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("hetongguanli")
public class HetongguanliView  extends HetongguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HetongguanliView(){
	}
 
 	public HetongguanliView(HetongguanliEntity hetongguanliEntity){
 	try {
			BeanUtils.copyProperties(this, hetongguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
