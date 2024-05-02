package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonggongdanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonggongdanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonggongdanweiView;


/**
 * 用工单位
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface YonggongdanweiService extends IService<YonggongdanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonggongdanweiVO> selectListVO(Wrapper<YonggongdanweiEntity> wrapper);
   	
   	YonggongdanweiVO selectVO(@Param("ew") Wrapper<YonggongdanweiEntity> wrapper);
   	
   	List<YonggongdanweiView> selectListView(Wrapper<YonggongdanweiEntity> wrapper);
   	
   	YonggongdanweiView selectView(@Param("ew") Wrapper<YonggongdanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonggongdanweiEntity> wrapper);
   	
}

