package com.capg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.bean.Product;

@RestController
public class frontcontroller {
	
	@RequestMapping("/product" )
	public Product getProduct( @RequestParam ("pid") String pid,
			@RequestParam ("feedback") String feedback ) {
		RestTemplate rt=new RestTemplate();
		Product p=rt.getForObject("http://localhost:9081/feedbackcommon?pid="+pid+"&feedback="+feedback,Product.class );
		return p;

	
				}

}
