package com.bw.serivce;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Goods;
import com.bw.mapper.GoodsMapper;

@Service
public class GoodsSerivceImp implements GoodsSerivce {

	@Resource
	private GoodsMapper goodsMapper;
	
	public List<Goods> selectGoods(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.selectGoods(map);
	}

	public int insertGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.insertGoods(goods);
	}

	public Goods selectOne(int id) {
		// TODO Auto-generated method stub
		return goodsMapper.selectOne(id);
	}

	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.updateGoods(goods);
	}

	public int delectGoods(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.delectGoods(map);
	}

	

}
