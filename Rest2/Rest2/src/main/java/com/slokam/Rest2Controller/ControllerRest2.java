package com.slokam.Rest2Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ControllerRest2 
{
	@Autowired
	private RestTemplate template;
	
	@GetMapping("getRest2Test")
	public String getRest2Test()
	{
		System.out.println("in getRest2Test");
	RestTemplate template=new RestTemplate();
	String str=template.getForObject("http://REST1/getRest1Test" , String.class);
	return "hello we are from getRest2Test==="+str;
	}
	

}
