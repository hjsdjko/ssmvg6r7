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


import com.dao.HeimingdanguanliDao;
import com.entity.HeimingdanguanliEntity;
import com.service.HeimingdanguanliService;
import com.entity.vo.HeimingdanguanliVO;
import com.entity.view.HeimingdanguanliView;

@Service("heimingdanguanliService")
public class HeimingdanguanliServiceImpl extends ServiceImpl<HeimingdanguanliDao, HeimingdanguanliEntity> implements HeimingdanguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HeimingdanguanliEntity> page = this.selectPage(
                new Query<HeimingdanguanliEntity>(params).getPage(),
                new EntityWrapper<HeimingdanguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HeimingdanguanliEntity> wrapper) {
		  Page<HeimingdanguanliView> page =new Query<HeimingdanguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HeimingdanguanliVO> selectListVO(Wrapper<HeimingdanguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HeimingdanguanliVO selectVO(Wrapper<HeimingdanguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HeimingdanguanliView> selectListView(Wrapper<HeimingdanguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HeimingdanguanliView selectView(Wrapper<HeimingdanguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
