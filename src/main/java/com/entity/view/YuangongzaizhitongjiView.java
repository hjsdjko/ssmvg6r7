package com.entity.view;

import com.entity.YuangongzaizhitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工在职统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@TableName("yuangongzaizhitongji")
public class YuangongzaizhitongjiView  extends YuangongzaizhitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongzaizhitongjiView(){
	}
 
 	public YuangongzaizhitongjiView(YuangongzaizhitongjiEntity yuangongzaizhitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongzaizhitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
