package com.krug.tcx.entities;

import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.krug.tcx.dal.TrackpointDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Trackpoint
 */
@DAO(daoClass = TrackpointDAO.class)
@Caption("{%id}")
@Entity
@Cacheable(true)
@Table(name = "trackpoint", catalog = "tcximporter")
public class Trackpoint implements java.io.Serializable {

	private int id;
	private Activity activity1;
	private Date time;
	private Integer heartrate;
	private Double distance;
	private Double altitude;
	private Double latitude;
	private Double longitude;

	public Trackpoint() {
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

	@Caption("Activity1")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "activity", nullable = false, columnDefinition = "INT")
	public Activity getActivity1() {
		return this.activity1;
	}

	public void setActivity1(Activity activity1) {
		this.activity1 = activity1;
	}

	@Caption("Time")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", columnDefinition = "DATETIME", length = 19)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Caption("Heartrate")
	@Column(name = "heartrate", columnDefinition = "INT")
	public Integer getHeartrate() {
		return this.heartrate;
	}

	public void setHeartrate(Integer heartrate) {
		this.heartrate = heartrate;
	}

	@Caption("Distance")
	@Column(name = "distance", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	@Caption("Altitude")
	@Column(name = "altitude", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}

	@Caption("Latitude")
	@Column(name = "latitude", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Caption("Longitude")
	@Column(name = "longitude", columnDefinition = "DOUBLE", precision = 22, scale = 0)
	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
