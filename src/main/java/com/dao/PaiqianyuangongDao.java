package com.dao;

import com.entity.PaiqianyuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaiqianyuangongVO;
import com.entity.view.PaiqianyuangongView;


/**
 * 派遣员工
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface PaiqianyuangongDao extends BaseMapper<PaiqianyuangongEntity> {
	
	List<PaiqianyuangongVO> selectListVO(@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);
	
	PaiqianyuangongVO selectVO(@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);
	
	List<PaiqianyuangongView> selectListView(@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);

	List<PaiqianyuangongView> selectListView(Pagination page,@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);
	
	PaiqianyuangongView selectView(@Param("ew") Wrapper<PaiqianyuangongEntity> wrapper);
	
}
