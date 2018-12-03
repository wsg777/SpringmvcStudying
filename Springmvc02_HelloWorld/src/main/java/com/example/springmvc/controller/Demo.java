/**
 * @author 王少刚
 * @create 2018-12-01 11:03
 */
package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {
	@RequestMapping(value = "/hello.action")
	public ModelAndView itemList(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/jsp/hello.jsp");
		return mav;
	}
}
