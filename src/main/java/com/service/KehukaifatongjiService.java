package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehukaifatongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KehukaifatongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KehukaifatongjiView;


/**
 * 客户开发统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface KehukaifatongjiService extends IService<KehukaifatongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KehukaifatongjiVO> selectListVO(Wrapper<KehukaifatongjiEntity> wrapper);
   	
   	KehukaifatongjiVO selectVO(@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);
   	
   	List<KehukaifatongjiView> selectListView(Wrapper<KehukaifatongjiEntity> wrapper);
   	
   	KehukaifatongjiView selectView(@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KehukaifatongjiEntity> wrapper);
   	
}

