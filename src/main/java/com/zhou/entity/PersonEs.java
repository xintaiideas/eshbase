package com.zhou.entity;


import com.zhou.hbase.HbaseColumn;
import com.zhou.hbase.HbaseTable;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.Mapping;

@HbaseTable(tableName="t_person")
@Mapping(mappingPath = "personIndex.json")
@Document(indexName = "users", type = "person")
public class PersonEs {




	private String id;

	private String idNumber;

	private String rowkey;

	public String getRowkey() {
		return rowkey;
	}

	public void setRowkey(String rowkey) {
		this.rowkey = rowkey;
	}

	@Field(analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
	@HbaseColumn(family="person", qualifier="name")
	private String name;

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
}
