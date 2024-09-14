package com.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
	
	@GetMapping("/getMap")
	public String getThis()
	{
		return "hii Automation task";
	}

}
