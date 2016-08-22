package com.springDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/hello.do")
public class TestController{
 
   @RequestMapping(value="/hello.do" ,method = RequestMethod.GET)
//	@RequestMapping
   public ModelAndView get(ModelAndView model) {
//      model.addAttribute("message", "Hello Mark!");
//      ModelAndView model = new ModelAndView();
		if(model.isEmpty()){
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("message", "Hello Mark!");
			return modelAndView;
		}		
      return model;
   }
   
//   @RequestMapping(value = "/showName", headers="Accept=*/*" , method = RequestMethod.GET)
//   @ResponseBody
   @RequestMapping(value = "/showName", method = RequestMethod.GET)
   public ModelAndView showName(HttpServletRequest request , HttpServletResponse responce){
//	   model.addAttribute("messageNew", "Saurabh");
	   ModelAndView model = new ModelAndView();
	   model.setViewName("hello");
	   model.addObject("messageNew", "Saurabh");
	   model.addObject("hello", "hello All");
//	   model.setViewName("hello");
	   return get(model);
   }

}