package com.mysql.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Preposisjon {
	
	@Id
	@GeneratedValue
	@Column(name="id")
    private Integer id;
	@Column(name="norsk")
    private String norsk;
	@Column(name="engelsk")
    private String engelsk;

    
    public Preposisjon() {}

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

	public void setTeamName(String engelsk) {
		this.engelsk = engelsk;
	}


    
    
}
