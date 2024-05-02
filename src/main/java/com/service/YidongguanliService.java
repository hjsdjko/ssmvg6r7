package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YidongguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YidongguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YidongguanliView;


/**
 * 异动管理
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface YidongguanliService extends IService<YidongguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YidongguanliVO> selectListVO(Wrapper<YidongguanliEntity> wrapper);
   	
   	YidongguanliVO selectVO(@Param("ew") Wrapper<YidongguanliEntity> wrapper);
   	
   	List<YidongguanliView> selectListView(Wrapper<YidongguanliEntity> wrapper);
   	
   	YidongguanliView selectView(@Param("ew") Wrapper<YidongguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YidongguanliEntity> wrapper);
   	
}

