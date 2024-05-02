package com.dao;

import com.entity.YuangongzaizhitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongzaizhitongjiVO;
import com.entity.view.YuangongzaizhitongjiView;


/**
 * 员工在职统计
 * 
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
public interface YuangongzaizhitongjiDao extends BaseMapper<YuangongzaizhitongjiEntity> {
	
	List<YuangongzaizhitongjiVO> selectListVO(@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);
	
	YuangongzaizhitongjiVO selectVO(@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);
	
	List<YuangongzaizhitongjiView> selectListView(@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);

	List<YuangongzaizhitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);
	
	YuangongzaizhitongjiView selectView(@Param("ew") Wrapper<YuangongzaizhitongjiEntity> wrapper);
	
}
