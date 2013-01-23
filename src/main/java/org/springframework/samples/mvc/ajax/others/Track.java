package org.springframework.samples.mvc.ajax.others;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;

import org.apache.taglibs.standard.tag.common.core.NullAttributeException;

public class Track implements Serializable{
	
	private int id;
	private String name;
	private Date date;
	private Time startTime;		//l'input da livello superiore deve essere long, così lo vuole il costruttore di Time
	private Time finishTime;		//l'input da livello superiore deve essere long, così lo vuole il costruttore di Time	
	
	public Track(){
		
	}

	/**
	 * @param id
	 * @param name
	 * @param date
	 * @param startTime
	 * @param finishTime
	 */
	public Track(int id, String name, Date date, Time startTime, Time finishTime){
		this.id = id;
		this.name = name;
		this.date = date;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		
		if(id<=0)
			throw new NullPointerException("The attribute 'id' of class Track is null.");
		
		this.id = id;
	}

	
	
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		
		if(name==null)
			throw new NullPointerException("The attribute 'name' of class Track is null.");
		
		this.name = name;
		
	}

	
	
	public Date getDate() {
		
		return date;
	}

	
	
	public void setDate(Date date) {
		
		if(date == null)
			throw new IllegalArgumentException("The attribute 'date' of class Track is invalid.");
		
		this.date = date;
		
	}

	
	
	public Time getStartTime() {
		return startTime;
	}

	
	
	public void setStartTime(Time startTime) {
		
		if(startTime == null)
			throw new NullPointerException("The attribute 'startTime' of class Track is null");
		
		this.startTime = startTime;
		
	}

	
	
	public Time getFinishTime() {
		return finishTime;
	}

	
	
	public void setFinishTime(Time finishTime) {
		
		if(finishTime == null)
			throw new NullPointerException("The attribute 'finishTime' of class Track is null");
		
		this.finishTime = finishTime;
		
	}
	
}