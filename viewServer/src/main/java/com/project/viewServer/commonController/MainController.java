package com.project.viewServer.commonController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	@RequestMapping("leeIndex")
	public void lee() {
		
	}
	@RequestMapping("nIndex")
	public void n() {
		
	}
}
