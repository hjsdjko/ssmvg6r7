package com.dao;

import com.entity.HetongguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HetongguanliVO;
import com.entity.view.HetongguanliView;


/**
 * 合同管理
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface HetongguanliDao extends BaseMapper<HetongguanliEntity> {
	
	List<HetongguanliVO> selectListVO(@Param("ew") Wrapper<HetongguanliEntity> wrapper);
	
	HetongguanliVO selectVO(@Param("ew") Wrapper<HetongguanliEntity> wrapper);
	
	List<HetongguanliView> selectListView(@Param("ew") Wrapper<HetongguanliEntity> wrapper);

	List<HetongguanliView> selectListView(Pagination page,@Param("ew") Wrapper<HetongguanliEntity> wrapper);
	
	HetongguanliView selectView(@Param("ew") Wrapper<HetongguanliEntity> wrapper);
	
}
