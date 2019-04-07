package com.mysql.db.model;

import javax.persistence.*;

@Entity
@Table(name="sterke_verb")
public class SterkeVerb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="infinitiv")
    private String infinitiv;
    @Column(name="presens")
    private String presens;
    @Column(name="preteritum")
    private String preteritum;
    @Column(name="perfektum_partisipp")
    private String perfektum_partisipp;
    @Column(name="engelsk")
    private String engelsk;

      public SterkeVerb() {}

    public SterkeVerb(String infinitiv, String presens, String preteritum, String perfektum_partisipp, String engelsk) {
        this.infinitiv = infinitiv;
        this.presens = presens;
        this.preteritum = preteritum;
        this.perfektum_partisipp = perfektum_partisipp;
        this.engelsk = engelsk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfinitiv() {
        return infinitiv;
    }

    public void setInfinitiv(String infinitiv) {
        this.infinitiv = infinitiv;
    }

    public String getPresens() {
        return presens;
    }

    public void setPresens(String presens) {
        this.presens = presens;
    }

    public String getPreteritum() {
        return preteritum;
    }

    public void setPreteritum(String preteritum) {
        this.preteritum = preteritum;
    }

    public String getPerfektum_partisipp() {
        return perfektum_partisipp;
    }

    public void setPerfektum_partisipp(String perfektum_partisipp) {
        this.perfektum_partisipp = perfektum_partisipp;
    }

    public String getEngelsk() {
        return engelsk;
    }

    public void setEngelsk(String engelsk) {
        this.engelsk = engelsk;
    }
}
