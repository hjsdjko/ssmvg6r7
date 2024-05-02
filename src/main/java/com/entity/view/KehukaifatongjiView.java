package com.entity.view;

import com.entity.KehukaifatongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 客户开发统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("kehukaifatongji")
public class KehukaifatongjiView  extends KehukaifatongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KehukaifatongjiView(){
	}
 
 	public KehukaifatongjiView(KehukaifatongjiEntity kehukaifatongjiEntity){
 	try {
			BeanUtils.copyProperties(this, kehukaifatongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
