/**
 * @author 王少刚
 * @create 2018-12-02 13:54
 */
package com.example.springmvc.service;

import com.example.springmvc.dao.ItemsMapper;
import com.example.springmvc.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	ItemsMapper itemsMapper;
	public List<Items> findAllItems() {
		return itemsMapper.selectByExampleWithBLOBs(null);
	}
	public Items findItemsById(Integer id) {
		return itemsMapper.selectByPrimaryKey(id);
	}
	public void updateItemsById(Items items) {
//		items.setCreatetime(new Date());
		itemsMapper.updateByPrimaryKeyWithBLOBs(items);
	}
}
