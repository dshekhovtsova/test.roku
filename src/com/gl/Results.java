package com.gl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {
	private double elevation;
	private double location;
	
	 @JsonCreator
	 public Results(@JsonProperty("elevation") double elevation, @JsonProperty("location") double location){
		this.elevation = elevation; 
		this.location = location; 
	 }

	public double getElevation() {
		return elevation;
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	public double getLocation() {
		return location;
	}

	public void setLocation(double location) {
		this.location = location;
	}
	

}
