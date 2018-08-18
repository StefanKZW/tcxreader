
package com.krug.tcx.dal;

import com.xdev.dal.JPADAO;
import com.krug.tcx.entities.Trackpoint;

/**
 * Home object for domain model class Trackpoint.
 * 
 * @see Trackpoint
 */
public class TrackpointDAO extends JPADAO<Trackpoint, Integer> {
	public TrackpointDAO() {
		super(Trackpoint.class);
	}
}