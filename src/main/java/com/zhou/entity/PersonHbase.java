package com.zhou.entity;


import com.zhou.MD5Utils;
import com.zhou.hbase.HbaseColumn;
import com.zhou.hbase.HbaseTable;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.Mapping;

@HbaseTable(tableName="t_person")
@Document(indexName = "users", type = "person")
public class PersonHbase {


	public PersonHbase(Person person){
		this.id= MD5Utils.string2MD5(person.getId());
		this.uid=person.getId();
		this.birth=person.getBirth();
		this.city=person.getCity();
		this.idNumber=person.getIdNumber();
		this.name = person.getName();
		this.sex=person.getSex();
	}
	public PersonHbase(){

	}

	@HbaseColumn(family="person", qualifier="uid")
	private String uid;

	@HbaseColumn(family="rowkey", qualifier="rowkey")
	private String id;


	@HbaseColumn(family="person", qualifier="idNumber")
	private String idNumber;

	@HbaseColumn(family="person", qualifier="city")
	private  String city;
	@Field(analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
	@HbaseColumn(family="person", qualifier="name")
	private String name;

	@HbaseColumn(family="person", qualifier="sex")
	private String sex;

	@HbaseColumn(family="person", qualifier="birth")
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
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}
