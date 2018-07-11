package com.javaee.luizhmpassos.springtests.controllers.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(IndexController.BASE_URL)
public class IndexController {

public static final String BASE_URL = "/api/v1/index";	
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String home() {
		return "Spring Tests - Home Principal";
	}
}
