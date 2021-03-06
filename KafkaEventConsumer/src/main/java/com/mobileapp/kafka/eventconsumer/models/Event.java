package com.mobileapp.kafka.eventconsumer.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Event implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 8989411878974026141L;
	private String ip;
	private Type eventType;
	private Date date;
	public Event() {
	}
	public Event(String ip, Type eventType, Date date) {
		super();
		this.ip = ip;
		this.eventType = eventType;
		this.date = date;
	}

	public Type getEventType() {
		return eventType;
	}
	public void setEventType(Type eventType) {
		this.eventType = eventType;
	}
	@Override
	public String toString() {
		return "Event [ip=" + ip + ", eventType=" + eventType + ", date=" + date.toString() + "]";
	}

	private Event(String ip,  Date date, Type eventType) {
		this.ip=ip;
		this.eventType=eventType;
		this.date=date;
	}
	
	public static Event createEvent(String ip, Type eventType, Date date) {	
		return new Event(ip, date,eventType);
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}

