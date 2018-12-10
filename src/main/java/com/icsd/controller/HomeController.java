package com.icsd.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	//1-By default method is get
	@RequestMapping(value="/WelcomeHome",method=RequestMethod.POST)
	public String welcomeHome()
	{
		return "Welcome to icsd tech labs spring boot application";
	}
	
	@RequestMapping(value="/GetUser")
	public String getUser(@RequestParam String name)
	{
		return "Welcome "+ name;
	}
	@RequestMapping(value="/GetUser2")
	public String getUser2(@RequestParam(value="name2")  String strName)
	{
		return "Welcome "+ strName;
	}
	
	@RequestMapping(value="/user")
	public Principal getUser3(Principal principal)
	{
		return principal;
	}
}
