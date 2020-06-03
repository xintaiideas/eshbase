package com.zhou.entity;


import com.zhou.hbase.HbaseTable;

import java.util.Date;

@HbaseTable(tableName="t_flight")
public class Flight {

	private String rowkey;

	public String getRowkey() {
		return rowkey;
	}

	public void setRowkey(String rowkey) {
		this.rowkey = rowkey;
	}

	private String id;

	private String uid;

	

	private String destination; //出发地


	private String arrival;



	private Date times;


	private  String plane;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrival() {
		return arrival;
	}

	public Date getTimes() {
		return times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}



	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}
}
