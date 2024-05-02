package com.dao;

import com.entity.KehukaifatongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KehukaifatongjiVO;
import com.entity.view.KehukaifatongjiView;


/**
 * 客户开发统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface KehukaifatongjiDao extends BaseMapper<KehukaifatongjiEntity> {
	
	List<KehukaifatongjiVO> selectListVO(@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);
	
	KehukaifatongjiVO selectVO(@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);
	
	List<KehukaifatongjiView> selectListView(@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);

	List<KehukaifatongjiView> selectListView(Pagination page,@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);
	
	KehukaifatongjiView selectView(@Param("ew") Wrapper<KehukaifatongjiEntity> wrapper);
	
}
