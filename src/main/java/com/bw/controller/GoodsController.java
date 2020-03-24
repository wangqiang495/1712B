package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.bean.Goods;
import com.bw.serivce.GoodsSerivce;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsSerivce goodsSerice;
	
	@RequestMapping("list")
	public String select(Model m, @RequestParam(defaultValue = "1")int pageNum){
		
		PageHelper.startPage(pageNum, 2);
		
		Map<String, Object> map = new HashMap<String, Object>();
		List<Goods> list = goodsSerice.selectGoods(map );
		
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		
		m.addAttribute("page", page);
		
		return "list";
		
	}
	
	@RequestMapping("add")
	public String insert(Goods goods){
		int i = goodsSerice.insertGoods(goods);
		if (i>0) {
			return "redirect:list";
		}else {
			return "add";
		}
	}
	
	@RequestMapping("selectOne")
	public Goods selectOne(int id){
		Goods one = goodsSerice.selectOne(id);
		return one;
	}
	
	@RequestMapping("update")
	public String updteGoods(Goods goods){
		int i = goodsSerice.updateGoods(goods);
		if (i>0) {
			return "redirect:list";
		}else {
			return "update";
		}
	}
	@RequestMapping("del")
	public boolean deleteGoods(int[] ids){
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("ids", ids);
		int i = goodsSerice.delectGoods(map);
		
		if (i>0) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
}
