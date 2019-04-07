package com.example.verb.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


    /**
     * The persistent class for the sterkeverb database table.
     * based on:   https://www.youtube.com/watch?v=gkBC9E3K0ZM
     */

    @Entity
    @Table(name="sterkeverbR")
    public class SterkeVerb implements Serializable {
        private static final long serialVersionUID = 1L;


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="id")
        private int id;
        @Column(name="norsk")
        private String norsk;
        @Column(name="engelsk")
        private String engelsk;
        @Column(name="preteritum")
        private String preteritum;
        @Column(name="perfektum")
        private String perfektum;


        public SterkeVerb() {}

        public SterkeVerb(int id, String norsk, String engelsk, String preteritum, String perfektum) {
            this.id = id;
            this.norsk = norsk;
            this.engelsk = engelsk;
            this.preteritum = preteritum;
            this.perfektum = perfektum;

        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNorsk() {
            return norsk;
        }

        public void setNorsk(String norsk) {
            this.norsk = norsk;
        }

        public String getEngelsk() {
            return engelsk;
        }

        public void setEngelsk(String engelsk) {
            this.engelsk = engelsk;
        }

        public String getPreteritum() {
            return preteritum;
        }

        public void setPreteritum(String preteritum) {
            this.preteritum = preteritum;
        }

        public String getPerfektum() {
            return perfektum;
        }

        public void setPerfektum(String perfektum) {
            this.perfektum = perfektum;
        }



    }

