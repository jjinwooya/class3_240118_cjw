package com.itwillbs.test_cjw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/BoardList")
	public String board_list() {
		return "board_list";
		//return "redirect:/BoardList2";
	}
}
