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


import com.dao.HetongguanliDao;
import com.entity.HetongguanliEntity;
import com.service.HetongguanliService;
import com.entity.vo.HetongguanliVO;
import com.entity.view.HetongguanliView;

@Service("hetongguanliService")
public class HetongguanliServiceImpl extends ServiceImpl<HetongguanliDao, HetongguanliEntity> implements HetongguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HetongguanliEntity> page = this.selectPage(
                new Query<HetongguanliEntity>(params).getPage(),
                new EntityWrapper<HetongguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HetongguanliEntity> wrapper) {
		  Page<HetongguanliView> page =new Query<HetongguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HetongguanliVO> selectListVO(Wrapper<HetongguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HetongguanliVO selectVO(Wrapper<HetongguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HetongguanliView> selectListView(Wrapper<HetongguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HetongguanliView selectView(Wrapper<HetongguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
