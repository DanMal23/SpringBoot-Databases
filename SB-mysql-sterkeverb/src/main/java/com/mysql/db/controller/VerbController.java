package com.mysql.db.controller;

import com.mysql.db.model.IVerbRepository;
import com.mysql.db.model.SterkeVerb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class VerbController {

    @Autowired
    IVerbRepository repository;

    @RequestMapping("/")
    public ModelAndView allVerb() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists", repository.findAll());
        return mv;
    }
    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView saveVerb(@RequestParam("id") String id,
                                 @RequestParam("infinitiv") String infinitiv,
                                 @RequestParam("presens") String presens,
                                 @RequestParam("preteritum") String preteritum,
                                 @RequestParam("perfektum_partisipp") String perfektum_partisipp,
                                 @RequestParam("engelsk") String engelsk)
    {
        ModelAndView mv = new ModelAndView("redirect:/");
        SterkeVerb setninger = new SterkeVerb();
        setninger.setInfinitiv(infinitiv);
        setninger.setPresens(presens);
        setninger.setPreteritum(preteritum);
        setninger.setPerfektum_partisipp(perfektum_partisipp);
        setninger.setEngelsk(engelsk);
        repository.save(setninger);
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteVerb(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        repository.deleteById(id);
        return mv;
    }

}
