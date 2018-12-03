/**
 * @author 王少刚
 * @create 2018-12-01 11:24
 */
package com.example.springmvc.controller;

import com.example.springmvc.pojo.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class Demo {
	@RequestMapping(value = "/hello.action")
	public ModelAndView itemList(){
		// 创建页面需要显示的商品数据
		List<Items> list = new ArrayList<>();
		list.add(new Items(1, "1华为 荣耀8", 2399f, new Date(), "质量好！1"));
		list.add(new Items(2, "2华为 荣耀8", 2399f, new Date(), "质量好！2"));
		list.add(new Items(3, "3华为 荣耀8", 2399f, new Date(), "质量好！3"));
		list.add(new Items(4, "4华为 荣耀8", 2399f, new Date(), "质量好！4"));
		list.add(new Items(5, "5华为 荣耀8", 2399f, new Date(), "质量好！5"));
		list.add(new Items(6, "6华为 荣耀8", 2399f, new Date(), "质量好！6"));

		ModelAndView mav = new ModelAndView();
		//数据
		mav.addObject("itemList", list);
		mav.setViewName("itemList");
		return mav;
	}
}
