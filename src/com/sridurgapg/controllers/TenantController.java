package com.sridurgapg.controllers;

import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;     
import com.sridurgapg.beans.Tenant;    
import com.sridurgapg.dao.TenantDao;    
@Controller    
public class TenantController {    
    @Autowired    
    TenantDao dao;//will inject dao from XML file    
        
    /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */    
    @RequestMapping("/tenantform")    
    public String showform(Model m){    
        m.addAttribute("command", new Tenant());  
        return "tenantform";   
    }    
    /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("tenant") Tenant tenant){    
        dao.saveTenantByPreparedStatement(tenant);    
        return "redirect:/viewtenants";//will redirect to viewemp request mapping    
    }    
    /* It provides list of employees in model object */    
   /* @RequestMapping("/viewtenants")    
    public String viewtenant(Model m){    
        List<Tenant> list=dao.getTenants();    
        m.addAttribute("list",list);  
        return "viewtenants";    
    }    */
    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/    
   /* @RequestMapping(value="/edittenant/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Tenant tenant=dao.getTenantById(id);    
        m.addAttribute("command",tenant);  
        return "tenanteditform";    
    }  */  
    /* It updates model object. */    
   /* @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("tenant") Tenant tenant){    
        dao.update(tenant);    
        return "redirect:/viewtenants";    
    }   */ 
    /* It deletes record for the given id in URL and redirects to /viewemp */    
   /* @RequestMapping(value="/deletetenant/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewtenants";    
    }   */  
  
         /*@RequestMapping(value="/viewtenants",method = RequestMethod.POST)    
         public String viewtenants(@ModelAttribute("tenant") Tenant tenant){    
             dao.getClass();  
             return "redirect:/viewtenants";//will redirect to viewemp request mapping    
         }   */ 
     }  
