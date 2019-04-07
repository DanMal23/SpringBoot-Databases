package com.mysql.db.model;

import javax.persistence.*;

@Entity
@Table(name="setninger")
public class Setninger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="norsk")
    public String norsk;
    @Column(name="engelsk")
    public String engelsk;

      public Setninger() {}

    public Setninger(String norsk, String engelsk) {
        this.norsk = norsk;
        this.engelsk = engelsk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
