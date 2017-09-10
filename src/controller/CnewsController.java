package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CnewsController {
	@RequestMapping("cnews/index")
	public String index(){
		return "anews.cnews.index";
	}
	
	@RequestMapping("cnews/detail")
	public String detail(){
		return "anews.cnews.detail";
	}
	
	@RequestMapping("cnews/add")
	public String add(){
		return "anews.cnews.add";
	}
	@RequestMapping("cnews/cat")
	public String cat(){
		return "anews.cnews.cat";
	}
	
	
}
