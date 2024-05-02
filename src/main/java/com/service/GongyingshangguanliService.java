package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingshangguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongyingshangguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongyingshangguanliView;


/**
 * 供应商管理
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface GongyingshangguanliService extends IService<GongyingshangguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongyingshangguanliVO> selectListVO(Wrapper<GongyingshangguanliEntity> wrapper);
   	
   	GongyingshangguanliVO selectVO(@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);
   	
   	List<GongyingshangguanliView> selectListView(Wrapper<GongyingshangguanliEntity> wrapper);
   	
   	GongyingshangguanliView selectView(@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongyingshangguanliEntity> wrapper);
   	
}

