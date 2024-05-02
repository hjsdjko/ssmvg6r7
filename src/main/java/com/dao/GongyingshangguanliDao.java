package com.dao;

import com.entity.GongyingshangguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongyingshangguanliVO;
import com.entity.view.GongyingshangguanliView;


/**
 * 供应商管理
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface GongyingshangguanliDao extends BaseMapper<GongyingshangguanliEntity> {
	
	List<GongyingshangguanliVO> selectListVO(@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);
	
	GongyingshangguanliVO selectVO(@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);
	
	List<GongyingshangguanliView> selectListView(@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);

	List<GongyingshangguanliView> selectListView(Pagination page,@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);
	
	GongyingshangguanliView selectView(@Param("ew") Wrapper<GongyingshangguanliEntity> wrapper);
	
}
