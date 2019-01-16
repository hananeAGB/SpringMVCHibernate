/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping(value="/listUtilisateur/",method=RequestMethod.GET)
    public ModelAndView showUsers(){
        ModelAndView model=new ModelAndView();
        model.addObject("msg","hello");
        System.out.println("nisrine khan");
        return model;
    }
     @RequestMapping(value="/CreateUser",method=RequestMethod.GET)
    public ModelAndView FormUser(){
        ModelAndView model=new ModelAndView("CreateUser");
        model.addObject("msg","msg");
        System.out.println("nisrine khan");
        return model;
    }
    
    @RequestMapping(value="/editUser",method=RequestMethod.GET)
    public ModelAndView EditUser(){
        ModelAndView model=new ModelAndView("CreateUser1");
        model.addObject("msg","msg");
        System.out.println("nisrine khan");
        return model;
    }
    
  
}