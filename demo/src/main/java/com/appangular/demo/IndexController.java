package com.appangular.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wilson-DK
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
	}

}
