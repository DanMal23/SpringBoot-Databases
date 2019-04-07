package com.example.verb.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

import javax.sql.DataSource;

import com.example.verb.model.SterkeVerb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;



@Service
public class VerbDAO implements IVerbDAO {


    JdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        template = new JdbcTemplate(dataSource);
    }



    public void save(SterkeVerb p) {

//String sql="insert into world.student(firstName,lastName,sex,dob,email,section,country,firstAttempt,subjects) values('"+p.getFirstName()+"','"+p.getLastName()+"','"+p.getSex()+"','"+p.getDob()+"','"+p.getEmail()+"','"+p.isFirstAttempt()+"','"+p.getCountry()+"',true,'"+convertListToDelimitedString(p.getSubjects())+"')";

        String sql="insert into sterkeverbR(norsk, engelsk, preteritum, perfektum) values('"+p.getNorsk()+"','"+p.getEngelsk()+"','"+p.getPreteritum()+"','"+p.getPerfektum()+"')";
        System.out.println(sql);
        template.update(sql);
    }


    public List<SterkeVerb> getAllVerb() {


        return template.query("select * from sterkeverbR",new ResultSetExtractor<List<SterkeVerb>>(){

            public List<SterkeVerb> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<SterkeVerb> list=new ArrayList<SterkeVerb>();
                while(rs.next()){
                    SterkeVerb e=new SterkeVerb();
                    e.setId(rs.getInt(1));
                    e.setNorsk(rs.getString(2));
                    e.setEngelsk(rs.getString(3));
                    e.setPreteritum(rs.getString(4));
                    e.setPerfektum(rs.getString(5));

                    list.add(e);
                }
                return list;
            }
        });


    }

    public List<SterkeVerb> getVerbByPage(int pageid, int total) {
        String sql="select * from sterkeverbR limit "+(pageid-1)+","+total;
        return template.query(sql,new ResultSetExtractor<List<SterkeVerb>>(){

            public List<SterkeVerb> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<SterkeVerb> list=new ArrayList<SterkeVerb>();

                while(rs.next()){
                    SterkeVerb e=new SterkeVerb();
                    e.setId(rs.getInt(1));
                    e.setNorsk(rs.getString(2));
                    e.setEngelsk(rs.getString(3));
                    e.setPreteritum(rs.getString(4));
                    e.setPerfektum(rs.getString(5));

                    list.add(e);
                }
                return list;
            }
        });
    }

    public SterkeVerb getVerbById(int id) {
        return template.query("select * from sterkeverbR where ID="+id,new ResultSetExtractor<SterkeVerb>(){

            public SterkeVerb extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                SterkeVerb e=new SterkeVerb();
                while(rs.next()){

                    e.setId(rs.getInt(1));
                    e.setNorsk(rs.getString(2));
                    e.setEngelsk(rs.getString(3));
                    e.setPreteritum(rs.getString(4));
                    e.setPerfektum(rs.getString(5));

                }
                return e;
            }
        });
    }


    public int count() {
        String sql="select count(*) from sterkeverbR";
        int count = template.queryForObject(sql,Integer.class);
        return count;
    }



    public void update(SterkeVerb p) {
        String sql="update sterkeverbR set norsk='"+p.getNorsk()+
                "',engelsk='"+p.getEngelsk()+
                "',preteritum='"+p.getPreteritum()+
                "',perfektum='"+p.getPerfektum()+
                "' where ID="+p.getId()+"";
        System.out.println(sql);
        template.update(sql);
    }

    public void delete(int id) {
        String sql="delete from sterkeverbR where ID="+id+"";
        template.update(sql);

    }

    public void delete() {
        String sql="delete from sterkeverbR where ID>0";
        template.update(sql);
    }


}
