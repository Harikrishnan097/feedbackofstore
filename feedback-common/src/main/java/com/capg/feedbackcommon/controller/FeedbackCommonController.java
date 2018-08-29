package com.capg.feedbackcommon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.feedbackcommon.service.IFeedbackCommonService;

@RestController
public class FeedbackCommonController {
	
	@Autowired
	IFeedbackCommonService service;
	
	
	
	@RequestMapping("/feedbackcommon/{pid}/{feedback}"/*, method=RequestMethod.POST*/)
	public void addFeedbackCommon(@PathVariable int pid,@PathVariable String feedback) {
		
		
		 service.addFeedback(pid, feedback);
		
		
	
	}
	
	
	
	


}
