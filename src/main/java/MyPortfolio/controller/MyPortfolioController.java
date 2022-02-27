package MyPortfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyPortfolioController {

	@RequestMapping("/")
	public String indexGo() {
		return "index";
	}
	
	@RequestMapping("/myProfile")
	public String myProfile() {
		return "aboutMe";
	}
	
	@RequestMapping("/slide")
	public String slide() {
		return "slide";
	}
	
	@RequestMapping("/todoplay")
	public String todoplay() {
		return "todoPlay";
	}
}
