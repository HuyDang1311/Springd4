package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {
	@RequestMapping("basic/index")
	public String index(){
		return "basic.basic.index";
	}
	
	@RequestMapping("basic/cat")
	public String cat(){
		return "basic.basic.cat";
	}
	
	@RequestMapping("basic/user")
	public String user(){
		return "basic.basic.user";
	}
}
