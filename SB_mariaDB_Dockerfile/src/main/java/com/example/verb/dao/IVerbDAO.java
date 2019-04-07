package com.example.verb.dao;

import com.example.verb.model.SterkeVerb;

import java.util.List;


    public interface IVerbDAO {

        public void save(SterkeVerb p);
        public List<SterkeVerb> getAllVerb();
        public List<SterkeVerb> getVerbByPage(int pageid, int total);
        public SterkeVerb getVerbById(int id);
        public int count() ;
        public void update(SterkeVerb p);
        public void delete(int id);
        public void delete();

    }
