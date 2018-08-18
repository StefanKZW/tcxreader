
package com.krug.tcx.dal;

import com.krug.tcx.entities.Activity;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Activity.
 * 
 * @see Activity
 */
public class ActivityDAO extends JPADAO<Activity, Integer> {
	public ActivityDAO() {
		super(Activity.class);
	}
}