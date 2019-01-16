/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.Controller;

import org.springframework.stereotype.Controller;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
//import org.springframework.test.web.client.match.MockRestRequestMatchers.method(HttpMethod);
@Controller
public class HomeController {
  //GetMapping("/hello/{name}")
   @RequestMapping(value="/hello", method = RequestMethod.GET)
    public ModelAndView showIndex(@RequestParam("name") String name){
        ModelAndView model=new ModelAndView("listUtilisateur");
        model.addObject("msg",name);
        System.out.println(name);
        return model;
    }
}
