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


import com.dao.PaiqianyuangongDao;
import com.entity.PaiqianyuangongEntity;
import com.service.PaiqianyuangongService;
import com.entity.vo.PaiqianyuangongVO;
import com.entity.view.PaiqianyuangongView;

@Service("paiqianyuangongService")
public class PaiqianyuangongServiceImpl extends ServiceImpl<PaiqianyuangongDao, PaiqianyuangongEntity> implements PaiqianyuangongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaiqianyuangongEntity> page = this.selectPage(
                new Query<PaiqianyuangongEntity>(params).getPage(),
                new EntityWrapper<PaiqianyuangongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaiqianyuangongEntity> wrapper) {
		  Page<PaiqianyuangongView> page =new Query<PaiqianyuangongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaiqianyuangongVO> selectListVO(Wrapper<PaiqianyuangongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaiqianyuangongVO selectVO(Wrapper<PaiqianyuangongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaiqianyuangongView> selectListView(Wrapper<PaiqianyuangongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaiqianyuangongView selectView(Wrapper<PaiqianyuangongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
