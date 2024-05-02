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


import com.dao.GongyingshangguanliDao;
import com.entity.GongyingshangguanliEntity;
import com.service.GongyingshangguanliService;
import com.entity.vo.GongyingshangguanliVO;
import com.entity.view.GongyingshangguanliView;

@Service("gongyingshangguanliService")
public class GongyingshangguanliServiceImpl extends ServiceImpl<GongyingshangguanliDao, GongyingshangguanliEntity> implements GongyingshangguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongyingshangguanliEntity> page = this.selectPage(
                new Query<GongyingshangguanliEntity>(params).getPage(),
                new EntityWrapper<GongyingshangguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongyingshangguanliEntity> wrapper) {
		  Page<GongyingshangguanliView> page =new Query<GongyingshangguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongyingshangguanliVO> selectListVO(Wrapper<GongyingshangguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongyingshangguanliVO selectVO(Wrapper<GongyingshangguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongyingshangguanliView> selectListView(Wrapper<GongyingshangguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongyingshangguanliView selectView(Wrapper<GongyingshangguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
