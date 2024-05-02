package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DanganguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DanganguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DanganguanliView;


/**
 * 档案管理
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface DanganguanliService extends IService<DanganguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DanganguanliVO> selectListVO(Wrapper<DanganguanliEntity> wrapper);
   	
   	DanganguanliVO selectVO(@Param("ew") Wrapper<DanganguanliEntity> wrapper);
   	
   	List<DanganguanliView> selectListView(Wrapper<DanganguanliEntity> wrapper);
   	
   	DanganguanliView selectView(@Param("ew") Wrapper<DanganguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DanganguanliEntity> wrapper);
   	
}

