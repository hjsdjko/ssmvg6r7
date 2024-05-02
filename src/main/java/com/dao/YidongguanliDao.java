package com.dao;

import com.entity.YidongguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YidongguanliVO;
import com.entity.view.YidongguanliView;


/**
 * 异动管理
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface YidongguanliDao extends BaseMapper<YidongguanliEntity> {
	
	List<YidongguanliVO> selectListVO(@Param("ew") Wrapper<YidongguanliEntity> wrapper);
	
	YidongguanliVO selectVO(@Param("ew") Wrapper<YidongguanliEntity> wrapper);
	
	List<YidongguanliView> selectListView(@Param("ew") Wrapper<YidongguanliEntity> wrapper);

	List<YidongguanliView> selectListView(Pagination page,@Param("ew") Wrapper<YidongguanliEntity> wrapper);
	
	YidongguanliView selectView(@Param("ew") Wrapper<YidongguanliEntity> wrapper);
	
}
