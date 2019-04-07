package com.example.verb.service;


import java.util.List;

import com.example.verb.dao.VerbDAO;
import com.example.verb.model.SterkeVerb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SterkeVerbService implements ISterkeVerbService {

    @Autowired
    VerbDAO verbDao;

    public void save(SterkeVerb sterkeVerb) {
        verbDao.save(sterkeVerb);

    }

    public List<SterkeVerb> getAllVerb() {
        return verbDao.getAllVerb();
    }

    public List<SterkeVerb> getVerbByPage(int pageid, int total)
    {
        return verbDao.getVerbByPage(pageid,total);
    }

    public int count() {
        return verbDao.count();
    }

    public SterkeVerb getVerbById(int id) {
        return verbDao.getVerbById(id);
    }

    public void update(SterkeVerb emp) {
        verbDao.update(emp);
    }

    public void delete(int id) {
        verbDao.delete(id);
    }

    public void delete() {
        verbDao.delete();
    }



}

