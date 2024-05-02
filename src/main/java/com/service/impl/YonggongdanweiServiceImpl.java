package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonggongdanweiDao;
import com.entity.YonggongdanweiEntity;
import com.service.YonggongdanweiService;
import com.entity.vo.YonggongdanweiVO;
import com.entity.view.YonggongdanweiView;

@Service("yonggongdanweiService")
public class YonggongdanweiServiceImpl extends ServiceImpl<YonggongdanweiDao, YonggongdanweiEntity> implements YonggongdanweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonggongdanweiEntity> page = this.selectPage(
                new Query<YonggongdanweiEntity>(params).getPage(),
                new EntityWrapper<YonggongdanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonggongdanweiEntity> wrapper) {
		  Page<YonggongdanweiView> page =new Query<YonggongdanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonggongdanweiVO> selectListVO(Wrapper<YonggongdanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonggongdanweiVO selectVO(Wrapper<YonggongdanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonggongdanweiView> selectListView(Wrapper<YonggongdanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonggongdanweiView selectView(Wrapper<YonggongdanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
