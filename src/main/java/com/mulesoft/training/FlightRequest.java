package com.mulesoft.training;

public class FlightRequest implements java.io.Serializable {

	String destination;
	String airline;
	
	public FlightRequest()	{
	}

	public FlightRequest(String destination, String airline)	{
		this.destination = destination;
		this.airline = airline;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}
}
