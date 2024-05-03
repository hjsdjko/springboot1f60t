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

import com.entity.ChangliaobankuaiEntity;
import com.entity.view.ChangliaobankuaiView;

import com.service.ChangliaobankuaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 畅聊板块
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
@RestController
@RequestMapping("/changliaobankuai")
public class ChangliaobankuaiController {
    @Autowired
    private ChangliaobankuaiService changliaobankuaiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChangliaobankuaiEntity changliaobankuai,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			changliaobankuai.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChangliaobankuaiEntity> ew = new EntityWrapper<ChangliaobankuaiEntity>();
		PageUtils page = changliaobankuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, changliaobankuai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChangliaobankuaiEntity changliaobankuai, 
		HttpServletRequest request){
        EntityWrapper<ChangliaobankuaiEntity> ew = new EntityWrapper<ChangliaobankuaiEntity>();
		PageUtils page = changliaobankuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, changliaobankuai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChangliaobankuaiEntity changliaobankuai){
       	EntityWrapper<ChangliaobankuaiEntity> ew = new EntityWrapper<ChangliaobankuaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( changliaobankuai, "changliaobankuai")); 
        return R.ok().put("data", changliaobankuaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChangliaobankuaiEntity changliaobankuai){
        EntityWrapper< ChangliaobankuaiEntity> ew = new EntityWrapper< ChangliaobankuaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( changliaobankuai, "changliaobankuai")); 
		ChangliaobankuaiView changliaobankuaiView =  changliaobankuaiService.selectView(ew);
		return R.ok("查询畅聊板块成功").put("data", changliaobankuaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChangliaobankuaiEntity changliaobankuai = changliaobankuaiService.selectById(id);
        return R.ok().put("data", changliaobankuai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChangliaobankuaiEntity changliaobankuai = changliaobankuaiService.selectById(id);
        return R.ok().put("data", changliaobankuai);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ChangliaobankuaiEntity changliaobankuai = changliaobankuaiService.selectById(id);
        if(type.equals("1")) {
        	changliaobankuai.setThumbsupnum(changliaobankuai.getThumbsupnum()+1);
        } else {
        	changliaobankuai.setCrazilynum(changliaobankuai.getCrazilynum()+1);
        }
        changliaobankuaiService.updateById(changliaobankuai);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChangliaobankuaiEntity changliaobankuai, HttpServletRequest request){
    	changliaobankuai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(changliaobankuai);
        changliaobankuaiService.insert(changliaobankuai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChangliaobankuaiEntity changliaobankuai, HttpServletRequest request){
    	changliaobankuai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(changliaobankuai);
        changliaobankuaiService.insert(changliaobankuai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChangliaobankuaiEntity changliaobankuai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(changliaobankuai);
        changliaobankuaiService.updateById(changliaobankuai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        changliaobankuaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ChangliaobankuaiEntity> wrapper = new EntityWrapper<ChangliaobankuaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = changliaobankuaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
