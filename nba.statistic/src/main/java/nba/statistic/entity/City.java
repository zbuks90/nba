package nba.statistic.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "city")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "name")
	private String name;
	
	@Column(name = "info")
	private String info;
	
	@ManyToOne
	private Team team;
	
	@ManyToOne
	private Match match;
	
	@Override
	public String toString() {
		
		return "City : "+this.id + ", " +this.name;
	}

}
