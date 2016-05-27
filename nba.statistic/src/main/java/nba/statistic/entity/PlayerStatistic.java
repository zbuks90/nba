package nba.statistic.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "playerstatistic")
public class PlayerStatistic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	private Player player;
	
	@ManyToOne
	private Team team;
	
	@ManyToOne
	private Match match;
	
	@Column(name = "points")
	private Integer points;
	
	@Column(name = "assists")
	private Integer assists;
	
	@Column(name = "rebounds")
	private Integer rebounds;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	

}
