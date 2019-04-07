package com.mysql.db.controller;

import com.mysql.db.model.ISetningerRepository;
import com.mysql.db.model.Setninger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SetningerController {

    @Autowired
    ISetningerRepository repository;

    @RequestMapping("/")
    public ModelAndView allData() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists", repository.findAll());
        return mv;
    }
    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView saveData(@RequestParam("id") String id, @RequestParam("norsk") String norsk, @RequestParam("engelsk") String engelsk){
        ModelAndView mv = new ModelAndView("redirect:/");
        Setninger setninger = new Setninger();
        setninger.setNorsk(norsk);
        setninger.setEngelsk(engelsk);
        repository.save(setninger);
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteS(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        repository.deleteById(id);
        return mv;
    }

}
