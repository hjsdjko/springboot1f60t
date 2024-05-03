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

import com.entity.ShumabankuaiEntity;
import com.entity.view.ShumabankuaiView;

import com.service.ShumabankuaiService;
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
 * 数码板块
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-22 15:52:53
 */
@RestController
@RequestMapping("/shumabankuai")
public class ShumabankuaiController {
    @Autowired
    private ShumabankuaiService shumabankuaiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShumabankuaiEntity shumabankuai,
		HttpServletRequest request){
        EntityWrapper<ShumabankuaiEntity> ew = new EntityWrapper<ShumabankuaiEntity>();
		PageUtils page = shumabankuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shumabankuai), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShumabankuaiEntity shumabankuai, 
		HttpServletRequest request){
        EntityWrapper<ShumabankuaiEntity> ew = new EntityWrapper<ShumabankuaiEntity>();
		PageUtils page = shumabankuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shumabankuai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShumabankuaiEntity shumabankuai){
       	EntityWrapper<ShumabankuaiEntity> ew = new EntityWrapper<ShumabankuaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shumabankuai, "shumabankuai")); 
        return R.ok().put("data", shumabankuaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShumabankuaiEntity shumabankuai){
        EntityWrapper< ShumabankuaiEntity> ew = new EntityWrapper< ShumabankuaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shumabankuai, "shumabankuai")); 
		ShumabankuaiView shumabankuaiView =  shumabankuaiService.selectView(ew);
		return R.ok("查询数码板块成功").put("data", shumabankuaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShumabankuaiEntity shumabankuai = shumabankuaiService.selectById(id);
		shumabankuai.setClicknum(shumabankuai.getClicknum()+1);
		shumabankuai.setClicktime(new Date());
		shumabankuaiService.updateById(shumabankuai);
        return R.ok().put("data", shumabankuai);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShumabankuaiEntity shumabankuai = shumabankuaiService.selectById(id);
		shumabankuai.setClicknum(shumabankuai.getClicknum()+1);
		shumabankuai.setClicktime(new Date());
		shumabankuaiService.updateById(shumabankuai);
        return R.ok().put("data", shumabankuai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShumabankuaiEntity shumabankuai, HttpServletRequest request){
    	shumabankuai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shumabankuai);
        shumabankuaiService.insert(shumabankuai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShumabankuaiEntity shumabankuai, HttpServletRequest request){
    	shumabankuai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shumabankuai);
        shumabankuaiService.insert(shumabankuai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShumabankuaiEntity shumabankuai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shumabankuai);
        shumabankuaiService.updateById(shumabankuai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shumabankuaiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShumabankuaiEntity> wrapper = new EntityWrapper<ShumabankuaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shumabankuaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ShumabankuaiEntity shumabankuai, HttpServletRequest request,String pre){
        EntityWrapper<ShumabankuaiEntity> ew = new EntityWrapper<ShumabankuaiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = shumabankuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shumabankuai), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,ShumabankuaiEntity shumabankuai, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "fenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "shumabankuai").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<ShumabankuaiEntity> shumabankuaiList = new ArrayList<ShumabankuaiEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                shumabankuaiList.addAll(shumabankuaiService.selectList(new EntityWrapper<ShumabankuaiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<ShumabankuaiEntity> ew = new EntityWrapper<ShumabankuaiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = shumabankuaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shumabankuai), params), params));
        List<ShumabankuaiEntity> pageList = (List<ShumabankuaiEntity>)page.getList();
        if(shumabankuaiList.size()<limit) {
            int toAddNum = (limit-shumabankuaiList.size())<=pageList.size()?(limit-shumabankuaiList.size()):pageList.size();
            for(ShumabankuaiEntity o1 : pageList) {
                boolean addFlag = true;
                for(ShumabankuaiEntity o2 : shumabankuaiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    shumabankuaiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        }
        page.setList(shumabankuaiList);
        return R.ok().put("data", page);
    }





}
