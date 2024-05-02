package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaiqianyuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaiqianyuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaiqianyuangongView;


/**
 * 派遣员工
 *
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface PaiqianyuangongService extends IService<PaiqianyuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaiqianyuangongVO> selectListVO(Wrapper<PaiqianyuangongEntity> wrapper);
   	
   	PaiqianyuangongVO selectVO(@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);
   	
   	List<PaiqianyuangongView> selectListView(Wrapper<PaiqianyuangongEntity> wrapper);
   	
   	PaiqianyuangongView selectView(@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaiqianyuangongEntity> wrapper);
   	
}

