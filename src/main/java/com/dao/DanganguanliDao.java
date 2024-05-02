package com.dao;

import com.entity.DanganguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DanganguanliVO;
import com.entity.view.DanganguanliView;


/**
 * 档案管理
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface DanganguanliDao extends BaseMapper<DanganguanliEntity> {
	
	List<DanganguanliVO> selectListVO(@Param("ew") Wrapper<DanganguanliEntity> wrapper);
	
	DanganguanliVO selectVO(@Param("ew") Wrapper<DanganguanliEntity> wrapper);
	
	List<DanganguanliView> selectListView(@Param("ew") Wrapper<DanganguanliEntity> wrapper);

	List<DanganguanliView> selectListView(Pagination page,@Param("ew") Wrapper<DanganguanliEntity> wrapper);
	
	DanganguanliView selectView(@Param("ew") Wrapper<DanganguanliEntity> wrapper);
	
}
