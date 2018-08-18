package com.krug.tcx.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.krug.tcx.dal.ActivityDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Activity
 */
@DAO(daoClass = ActivityDAO.class)
@Caption("{%starttimestring}")
@Entity
@Cacheable(true)
@Table(name = "activity", catalog = "tcximporter", uniqueConstraints = @UniqueConstraint(columnNames = "starttime"))
public class Activity implements java.io.Serializable {

	private int id;
	private Date starttime;
	private String starttimestring;
	private Double totaltime;
	private Double distance;
	private Integer calories;
	private Integer avgheartrate;
	private Integer maxheartrate;
	private Double maxspeed;
	private Set<Trackpoint> trackpoints = new HashSet<Trackpoint>(0);

	public Activity() {
	}

	@Caption("Id")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false, columnDefinition = "INT")
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Caption("Starttime")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "starttime", unique = true, columnDefinition = "DATETIME", length = 19)
	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	@Caption("Starttimestring")
	@Column(name = "starttimestring", columnDefinition = "VARCHAR", length = 50)
	public String getStarttimestring() {
		return this.starttimestring;
	}

	public void setStarttimestring(String starttimestring) {
		this.starttimestring = starttimestring;
	}

	@Caption("Totaltime")
	@Column(name = "totaltime", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getTotaltime() {
		return this.totaltime;
	}

	public void setTotaltime(Double totaltime) {
		this.totaltime = totaltime;
	}

	@Caption("Distance")
	@Column(name = "distance", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	@Caption("Calories")
	@Column(name = "calories", columnDefinition = "INT")
	public Integer getCalories() {
		return this.calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	@Caption("Avgheartrate")
	@Column(name = "avgheartrate", columnDefinition = "INT")
	public Integer getAvgheartrate() {
		return this.avgheartrate;
	}

	public void setAvgheartrate(Integer avgheartrate) {
		this.avgheartrate = avgheartrate;
	}

	@Caption("Maxheartrate")
	@Column(name = "maxheartrate", columnDefinition = "INT")
	public Integer getMaxheartrate() {
		return this.maxheartrate;
	}

	public void setMaxheartrate(Integer maxheartrate) {
		this.maxheartrate = maxheartrate;
	}

	@Caption("Maxspeed")
	@Column(name = "maxspeed", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getMaxspeed() {
		return this.maxspeed;
	}

	public void setMaxspeed(Double maxspeed) {
		this.maxspeed = maxspeed;
	}

	@Caption("Trackpoints")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "activity1")
	public Set<Trackpoint> getTrackpoints() {
		return this.trackpoints;
	}

	public void setTrackpoints(Set<Trackpoint> trackpoints) {
		this.trackpoints = trackpoints;
	}

}
