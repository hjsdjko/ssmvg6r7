package com.dao;

import com.entity.HeimingdanguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HeimingdanguanliVO;
import com.entity.view.HeimingdanguanliView;


/**
 * 黑名单管理
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface HeimingdanguanliDao extends BaseMapper<HeimingdanguanliEntity> {
	
	List<HeimingdanguanliVO> selectListVO(@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);
	
	HeimingdanguanliVO selectVO(@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);
	
	List<HeimingdanguanliView> selectListView(@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);

	List<HeimingdanguanliView> selectListView(Pagination page,@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);
	
	HeimingdanguanliView selectView(@Param("ew") Wrapper<HeimingdanguanliEntity> wrapper);
	
}
