package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnewsController {
	@RequestMapping("anews/index")
	public String index(){
		return "anews.anews.index";
	}
	
	@RequestMapping("anews/detail")
	public String detail(){
		return "anews.anews.detail";
	}
	
	@RequestMapping("anews/add")
	public String add(){
		return "anews.anews.add";
	}
	@RequestMapping("anews/cat")
	public String cat(){
		return "anews.anews.cat";
	}
	
	
}
