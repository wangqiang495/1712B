package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Goods;

public interface GoodsMapper {

	List<Goods> selectGoods(Map<String, Object> map); 
	
	int insertGoods(Goods goods);
	
	Goods selectOne(int id);
	
	int updateGoods(Goods goods);
	
	int delectGoods(Map<String, Object> map);
}
