package nba.statistic.entity;

import java.util.Date;
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
@Table(name = "nbamatch")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	private Team team1;
	
	@ManyToOne
	private Team team2;
	
	@Column(name = "startTime")
	private Date startTime;
	
	@OneToMany
	private List<City> city;
	
	@ManyToOne
	private PlayerStatistic playerStatistic;
	
	@Column(name = "halftimeScore")
	private Integer halftimeScore;
	
	@Column(name = "fulltimeScore")
	private Integer fulltimeScore;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	

	public Integer getHalftimeScore() {
		return halftimeScore;
	}

	public void setHalftimeScore(Integer halftimeScore) {
		this.halftimeScore = halftimeScore;
	}

	public Integer getFulltimeScore() {
		return fulltimeScore;
	}

	public void setFulltimeScore(Integer fulltimeScore) {
		this.fulltimeScore = fulltimeScore;
	}


}
