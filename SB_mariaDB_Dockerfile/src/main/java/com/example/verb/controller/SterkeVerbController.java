package com.example.verb.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.example.verb.model.SterkeVerb;
import com.example.verb.service.SterkeVerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller

public class SterkeVerbController {

    @Autowired
    private SterkeVerbService sterkeVerbService;

    @RequestMapping(value ="/add",method = RequestMethod.GET)
    public String newAddition(ModelMap model) {
        SterkeVerb verb = new SterkeVerb();
        model.addAttribute("verb", verb);
        return "add";
    }

    @RequestMapping(value ="/save",method = RequestMethod.POST)
    public String saveVerb(@Valid SterkeVerb verb,
                                   BindingResult result, ModelMap model,RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "add";
        }
        sterkeVerbService.save(verb);
        return "redirect:/table/1";
    }

    @RequestMapping("/table")
    public ModelAndView viewverb(){
        List<SterkeVerb> list=sterkeVerbService.getAllVerb();
        return new ModelAndView("table","list",list);
    }

    @RequestMapping(value="/table/{pageid}")
    public ModelAndView edit(@PathVariable int pageid){
        int total=10;  //verbs per page
        if(pageid==1){}
        else{
            pageid=(pageid-1)*total+1;
        }
        List<SterkeVerb> list=sterkeVerbService.getVerbByPage(pageid,total);

        return new ModelAndView("table","list",list);
    }

    @RequestMapping(value="/editverb/{id}")
    public String edit(@PathVariable int id,ModelMap model){
        SterkeVerb verb=sterkeVerbService.getVerbById(id);
        model.addAttribute("verb", verb);
        return "editverb";

    }

    @RequestMapping(value="/editsave",method = RequestMethod.POST)
    public ModelAndView editsave(@ModelAttribute("verb") SterkeVerb emp){
        sterkeVerbService.update(emp);
        return new ModelAndView("redirect:/table/1");
    }

    @RequestMapping(value="/deleteverb/{id}",method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id){
        sterkeVerbService.delete(id);
        return new ModelAndView("redirect:/table/1");
    }
    //pagination
    @ModelAttribute("pageCount")
    public List<String> initializePageCount() {
        int total=3;
        List<String> pageCount = new ArrayList<String>();
        int count=sterkeVerbService.count();
        int result=((count/total)+ (count%total));
        for(int k=0;k<result;k++) {
            pageCount.add(new Integer(k).toString());
        }
        return pageCount;
    }

}