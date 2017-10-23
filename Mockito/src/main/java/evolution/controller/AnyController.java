package evolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import evolution.pojo.AnyPojo;
import evolution.service.AnyService;

@RestController
public class AnyController {
	@Autowired
	private AnyService anyService;
	
	@GetMapping("/get")
	public void get() {
		
	}
	
	@PostMapping("/post")
	public AnyPojo post(@RequestBody AnyPojo anyPojo) {
		return anyService.anyMethod(anyPojo);
	}
}
