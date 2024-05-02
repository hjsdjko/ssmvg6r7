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


import com.dao.DanganguanliDao;
import com.entity.DanganguanliEntity;
import com.service.DanganguanliService;
import com.entity.vo.DanganguanliVO;
import com.entity.view.DanganguanliView;

@Service("danganguanliService")
public class DanganguanliServiceImpl extends ServiceImpl<DanganguanliDao, DanganguanliEntity> implements DanganguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DanganguanliEntity> page = this.selectPage(
                new Query<DanganguanliEntity>(params).getPage(),
                new EntityWrapper<DanganguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DanganguanliEntity> wrapper) {
		  Page<DanganguanliView> page =new Query<DanganguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DanganguanliVO> selectListVO(Wrapper<DanganguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DanganguanliVO selectVO(Wrapper<DanganguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DanganguanliView> selectListView(Wrapper<DanganguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DanganguanliView selectView(Wrapper<DanganguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
