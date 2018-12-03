/**
 * @author 王少刚
 * @create 2018-12-02 13:53
 */
package com.example.springmvc.service;

import com.example.springmvc.pojo.Items;

import java.util.List;

public interface ItemsService {
	public List<Items> findAllItems();
	public Items findItemsById(Integer id);
	public void updateItemsById(Items items);
}
