package com.entity.view;

import com.entity.PaiqianyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 派遣员工
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("paiqianyuangong")
public class PaiqianyuangongView  extends PaiqianyuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaiqianyuangongView(){
	}
 
 	public PaiqianyuangongView(PaiqianyuangongEntity paiqianyuangongEntity){
 	try {
			BeanUtils.copyProperties(this, paiqianyuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
