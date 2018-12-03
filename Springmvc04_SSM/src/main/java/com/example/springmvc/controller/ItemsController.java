/**
 * @author 王少刚
 * @create 2018-12-02 13:45
 */
package com.example.springmvc.controller;

import com.example.springmvc.pojo.Items;
import com.example.springmvc.service.ItemsService;
import com.example.springmvc.vo.ItemsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemsController {

	@Autowired
	ItemsService itemsService;

	// HelloWorld
	@RequestMapping(value = "/itemList.action")
	public ModelAndView itemList() {
		List<Items> allItems = itemsService.findAllItems();
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemList", allItems);
		mav.setViewName("itemList");
		return mav;
	}

	// 绑定简单类型
	@RequestMapping(value = "/itemEdit.action")
	public ModelAndView itemEdit(Integer id) {
		Items item = itemsService.findItemsById(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("item", item);
		mav.setViewName("editItem");
		return mav;
	}

	// 绑定pojo
//	@RequestMapping(value = "/updateitem.action")
//	public ModelAndView edit(Items items) {
//		itemsService.updateItemsById(items);
//		System.out.println("Success");
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("success");
//		return mav;
//	}

	// 绑定vo
	@RequestMapping(value = "/updateitem.action")
	public ModelAndView edit(ItemsVo itemsVo) {
		itemsService.updateItemsById(itemsVo.getItems());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		return mav;
	}
}
