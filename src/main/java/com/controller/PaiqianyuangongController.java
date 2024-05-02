package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PaiqianyuangongEntity;
import com.entity.view.PaiqianyuangongView;

import com.service.PaiqianyuangongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 派遣员工
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-26 17:34:34
 */
@RestController
@RequestMapping("/paiqianyuangong")
public class PaiqianyuangongController {
    @Autowired
    private PaiqianyuangongService paiqianyuangongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PaiqianyuangongEntity paiqianyuangong, 
		HttpServletRequest request){

        EntityWrapper<PaiqianyuangongEntity> ew = new EntityWrapper<PaiqianyuangongEntity>();
		PageUtils page = paiqianyuangongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, paiqianyuangong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PaiqianyuangongEntity paiqianyuangong, 
		HttpServletRequest request){
        EntityWrapper<PaiqianyuangongEntity> ew = new EntityWrapper<PaiqianyuangongEntity>();
		PageUtils page = paiqianyuangongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, paiqianyuangong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PaiqianyuangongEntity paiqianyuangong){
       	EntityWrapper<PaiqianyuangongEntity> ew = new EntityWrapper<PaiqianyuangongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( paiqianyuangong, "paiqianyuangong")); 
        return R.ok().put("data", paiqianyuangongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PaiqianyuangongEntity paiqianyuangong){
        EntityWrapper< PaiqianyuangongEntity> ew = new EntityWrapper< PaiqianyuangongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( paiqianyuangong, "paiqianyuangong")); 
		PaiqianyuangongView paiqianyuangongView =  paiqianyuangongService.selectView(ew);
		return R.ok("查询派遣员工成功").put("data", paiqianyuangongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PaiqianyuangongEntity paiqianyuangong = paiqianyuangongService.selectById(id);
        return R.ok().put("data", paiqianyuangong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PaiqianyuangongEntity paiqianyuangong = paiqianyuangongService.selectById(id);
        return R.ok().put("data", paiqianyuangong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PaiqianyuangongEntity paiqianyuangong, HttpServletRequest request){
    	paiqianyuangong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(paiqianyuangong);

        paiqianyuangongService.insert(paiqianyuangong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PaiqianyuangongEntity paiqianyuangong, HttpServletRequest request){
    	paiqianyuangong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(paiqianyuangong);

        paiqianyuangongService.insert(paiqianyuangong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PaiqianyuangongEntity paiqianyuangong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(paiqianyuangong);
        paiqianyuangongService.updateById(paiqianyuangong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        paiqianyuangongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PaiqianyuangongEntity> wrapper = new EntityWrapper<PaiqianyuangongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = paiqianyuangongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
