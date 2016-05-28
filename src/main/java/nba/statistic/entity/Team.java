package nba.statistic.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {
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
	
	@OneToMany
	private List<City> city;
	
	@ManyToOne
	private Player player;
	
	@OneToMany
	private List<Match> match;

	
	public Team(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		
		return "Team : " +this.name;
	}

}
