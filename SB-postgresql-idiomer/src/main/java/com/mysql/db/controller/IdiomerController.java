package com.mysql.db.controller;

import com.mysql.db.model.IIdiomerRepository;
import com.mysql.db.model.Idiomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IdiomerController {

    @Autowired
    IIdiomerRepository repository;

    @RequestMapping("/")
    public ModelAndView allIdiomer() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists", repository.findAll());
        return mv;
    }
    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView saveIdiom(@RequestParam("id") String id,
                                 @RequestParam("norsk") String norsk,
                                 @RequestParam("engelsk") String engelsk)
    {
        ModelAndView mv = new ModelAndView("redirect:/");
        Idiomer setninger = new Idiomer();
        setninger.setNorsk(norsk);
        setninger.setEngelsk(engelsk);
        repository.save(setninger);
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteIdiom(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        repository.deleteById(id);
        return mv;
    }

}
