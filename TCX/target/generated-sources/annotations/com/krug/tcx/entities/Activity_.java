package com.krug.tcx.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Activity.class)
public abstract class Activity_ {

	public static volatile SetAttribute<Activity, Trackpoint> trackpoints;
	public static volatile SingularAttribute<Activity, Integer> avgheartrate;
	public static volatile SingularAttribute<Activity, Double> totaltime;
	public static volatile SingularAttribute<Activity, Double> distance;
	public static volatile SingularAttribute<Activity, String> starttimestring;
	public static volatile SingularAttribute<Activity, Double> maxspeed;
	public static volatile SingularAttribute<Activity, Integer> maxheartrate;
	public static volatile SingularAttribute<Activity, Integer> id;
	public static volatile SingularAttribute<Activity, Date> starttime;
	public static volatile SingularAttribute<Activity, Integer> calories;

}

