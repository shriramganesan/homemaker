package com.ram.rest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/support")
public class SanityService {

	@GetMapping("sanity")
	public String sanity() {
		return Boolean.TRUE.toString();
	}
}
