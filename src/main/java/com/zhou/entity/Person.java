package com.zhou.entity;


import com.zhou.MD5Utils;
import com.zhou.hbase.HbaseColumn;
import com.zhou.hbase.HbaseTable;
import org.mortbay.jetty.security.Credential;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.Mapping;


public class Person {





	private String id;

	private String idNumber;


	private  String city;

	private String name;


	private String sex;


	private String birth;




	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}
