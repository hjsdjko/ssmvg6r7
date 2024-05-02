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


import com.dao.YuangongzaizhitongjiDao;
import com.entity.YuangongzaizhitongjiEntity;
import com.service.YuangongzaizhitongjiService;
import com.entity.vo.YuangongzaizhitongjiVO;
import com.entity.view.YuangongzaizhitongjiView;

@Service("yuangongzaizhitongjiService")
public class YuangongzaizhitongjiServiceImpl extends ServiceImpl<YuangongzaizhitongjiDao, YuangongzaizhitongjiEntity> implements YuangongzaizhitongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongzaizhitongjiEntity> page = this.selectPage(
                new Query<YuangongzaizhitongjiEntity>(params).getPage(),
                new EntityWrapper<YuangongzaizhitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongzaizhitongjiEntity> wrapper) {
		  Page<YuangongzaizhitongjiView> page =new Query<YuangongzaizhitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongzaizhitongjiVO> selectListVO(Wrapper<YuangongzaizhitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongzaizhitongjiVO selectVO(Wrapper<YuangongzaizhitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongzaizhitongjiView> selectListView(Wrapper<YuangongzaizhitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongzaizhitongjiView selectView(Wrapper<YuangongzaizhitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
