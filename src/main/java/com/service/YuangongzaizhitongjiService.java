package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongzaizhitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongzaizhitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongzaizhitongjiView;


/**
 * 员工在职统计
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface YuangongzaizhitongjiService extends IService<YuangongzaizhitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongzaizhitongjiVO> selectListVO(Wrapper<YuangongzaizhitongjiEntity> wrapper);
   	
   	YuangongzaizhitongjiVO selectVO(@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);
   	
   	List<YuangongzaizhitongjiView> selectListView(Wrapper<YuangongzaizhitongjiEntity> wrapper);
   	
   	YuangongzaizhitongjiView selectView(@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongzaizhitongjiEntity> wrapper);
   	
}

