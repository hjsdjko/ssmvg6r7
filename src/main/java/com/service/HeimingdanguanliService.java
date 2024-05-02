package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HeimingdanguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HeimingdanguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HeimingdanguanliView;


/**
 * 黑名单管理
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface HeimingdanguanliService extends IService<HeimingdanguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HeimingdanguanliVO> selectListVO(Wrapper<HeimingdanguanliEntity> wrapper);
   	
   	HeimingdanguanliVO selectVO(@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);
   	
   	List<HeimingdanguanliView> selectListView(Wrapper<HeimingdanguanliEntity> wrapper);
   	
   	HeimingdanguanliView selectView(@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HeimingdanguanliEntity> wrapper);
   	
}

