package org.springframework.samples.mvc.ajax.others;

import java.io.Serializable;

/**
 * @author Stefano
 *
 */
/**
 * @author Stefano
 *
 */
/**
 * @author Stefano
 *
 */
/**
 * @author Stefano
 *
 */
public class Coordinate implements Serializable{
	
	private int id;
	private double latitude;	//modifica database!!
	private double longitude;   //modifica database!!
	
	public Coordinate(){
	}
	
	/**
	 * @param id
	 * @param latitude
	 * @param longitude
	 */
	public Coordinate(int id, double latitude, double longitude){
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	
	/**
	 * @return id
	 */
	public int getId() {
		
		if(id<=0)
			throw new NullPointerException("The attribute 'id' of class Coordinate is null.");
		
		return id;
	}
	
	
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		
		if(id<=0)
			throw new NullPointerException("The attribute 'id' of class Coordinate is null.");
		
		this.id = id;
		
	}

	
	
	/**
	 * @return latitude
	 */
	public double getLatitude() {
		
		if(latitude<=0)
			throw new NullPointerException("The attribute 'latitude' of class Coordinate is null.");
		
		return latitude;
	}

	
	
	/**
	 * @param latitude
	 */
	public void setLatitude(double latitude) {
		
		if(latitude<=0)
			throw new NullPointerException("The attribute 'latitude' of class Coordinate is null.");
				
		this.latitude = latitude;
	}

	
	
	/**
	 * @return longitude
	 */
	public double getLongitude() {
		
		if(longitude<=0)
			throw new NullPointerException("The attribute 'longitude' of class Coordinate is null.");
		
		return longitude;
	}

	
	
	/**
	 * @param longitude
	 */
	public void setLongitude(double longitude) {
		
		if(longitude<=0)
			throw new NullPointerException("The attribute 'longitude' of class Coordinate is null.");
		
		this.longitude = longitude;
	}

	
}
