package com.krug.tcx.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trackpoint.class)
public abstract class Trackpoint_ {

	public static volatile SingularAttribute<Trackpoint, Activity> activity1;
	public static volatile SingularAttribute<Trackpoint, Double> altitude;
	public static volatile SingularAttribute<Trackpoint, Double> distance;
	public static volatile SingularAttribute<Trackpoint, Integer> heartrate;
	public static volatile SingularAttribute<Trackpoint, Double> latitude;
	public static volatile SingularAttribute<Trackpoint, Integer> id;
	public static volatile SingularAttribute<Trackpoint, Date> time;
	public static volatile SingularAttribute<Trackpoint, Double> longitude;

}

