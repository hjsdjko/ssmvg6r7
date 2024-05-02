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


import com.dao.KehukaifatongjiDao;
import com.entity.KehukaifatongjiEntity;
import com.service.KehukaifatongjiService;
import com.entity.vo.KehukaifatongjiVO;
import com.entity.view.KehukaifatongjiView;

@Service("kehukaifatongjiService")
public class KehukaifatongjiServiceImpl extends ServiceImpl<KehukaifatongjiDao, KehukaifatongjiEntity> implements KehukaifatongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KehukaifatongjiEntity> page = this.selectPage(
                new Query<KehukaifatongjiEntity>(params).getPage(),
                new EntityWrapper<KehukaifatongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KehukaifatongjiEntity> wrapper) {
		  Page<KehukaifatongjiView> page =new Query<KehukaifatongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KehukaifatongjiVO> selectListVO(Wrapper<KehukaifatongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KehukaifatongjiVO selectVO(Wrapper<KehukaifatongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KehukaifatongjiView> selectListView(Wrapper<KehukaifatongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KehukaifatongjiView selectView(Wrapper<KehukaifatongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
