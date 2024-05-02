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


import com.dao.YidongguanliDao;
import com.entity.YidongguanliEntity;
import com.service.YidongguanliService;
import com.entity.vo.YidongguanliVO;
import com.entity.view.YidongguanliView;

@Service("yidongguanliService")
public class YidongguanliServiceImpl extends ServiceImpl<YidongguanliDao, YidongguanliEntity> implements YidongguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YidongguanliEntity> page = this.selectPage(
                new Query<YidongguanliEntity>(params).getPage(),
                new EntityWrapper<YidongguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YidongguanliEntity> wrapper) {
		  Page<YidongguanliView> page =new Query<YidongguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YidongguanliVO> selectListVO(Wrapper<YidongguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YidongguanliVO selectVO(Wrapper<YidongguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YidongguanliView> selectListView(Wrapper<YidongguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YidongguanliView selectView(Wrapper<YidongguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
