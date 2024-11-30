package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/one")
//	@ResponseBody
	public String get()
    {
    	return "hello";
    }
    @RequestMapping("/insert_data")
    String insert(HttpServletRequest req,Model m)
	{
		String roll=req.getParameter("roll");
		String name=req.getParameter("n");
		String per=req.getParameter("per");
		System.out.println(roll+":"+name+":"+per);
		
		m.addAttribute("roll",roll);
		m.addAttribute("name", name);
		m.addAttribute("per", per);
		
		return "insert_data";
	}
	

	}


