package com.gl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonObject {
public Results [] results;

@JsonCreator
public JsonObject(@JsonProperty("results") Results []results){
	this.results = results; 
}
 public final Results[] getResults() {
	return results;
}
public final void setResults(Results[] results) {
	this.results = results;
}

}
