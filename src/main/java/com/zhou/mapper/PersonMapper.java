package com.zhou.mapper;


import com.zhou.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * APP用户 数据层
 * 
 * @Author guoyichao
 * @date 2019-04-01
 */

public interface PersonMapper
{

	public List<Person> selectTop100();


	public void updateTop100(@Param("uptime")String time ,@Param("list")  List<Person>  personLists);

	public void updateBack();

	public int insertUser( Person person);
}