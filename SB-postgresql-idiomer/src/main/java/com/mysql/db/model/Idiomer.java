package com.mysql.db.model;

/*The App has been created using Spring Boot;
* The program accesses PostgreSQL database system
* that can be managed via phpPgAdmin web pages.
* The app itself enables an update
* of a collection of idioms using localhost
* pages where you can feed data
* and submit them to database on phpPgAdmin.
* Delete(/Stryk ut) option is also available.**/

import javax.persistence.*;

@Entity
@Table(name="idiomer")
public class Idiomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="norsk")
    private String norsk;
    @Column(name="engelsk")
    private String engelsk;

      public Idiomer() {}

    public Idiomer( int id, String norsk, String engelsk) {
        this.id = id;
        this.norsk = norsk;
        this.engelsk = engelsk;
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
}
