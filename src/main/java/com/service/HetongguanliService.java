package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HetongguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HetongguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HetongguanliView;


/**
 * 合同管理
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface HetongguanliService extends IService<HetongguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HetongguanliVO> selectListVO(Wrapper<HetongguanliEntity> wrapper);
   	
   	HetongguanliVO selectVO(@Param("ew") Wrapper<HetongguanliEntity> wrapper);
   	
   	List<HetongguanliView> selectListView(Wrapper<HetongguanliEntity> wrapper);
   	
   	HetongguanliView selectView(@Param("ew") Wrapper<HetongguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HetongguanliEntity> wrapper);
   	
}

