package com.anuj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author Anuj singh
 * @Date 14/08/2017
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	  @RequestMapping(method = RequestMethod.GET)
	    public String getIndexPage() {
	        return "UserManagement";
	    
		
	  @RequestMapping(value="/save",method = RequestMethod.POST)
	    public String save() {
	        return "save";
	    }
		
		

}