package com.zhou.entity;

import com.zhou.document.ProductDocument;

import java.util.Date;

/**
 * 产品实体
 * @Author guoyichao
 * @version 0.1
 * @date 2018/12/13 15:22
 */
public class PersonBuilder {
    private static Person person;

    // create start
    public static PersonBuilder create(){
        person = new Person();
        return new PersonBuilder();
    }
    public PersonBuilder addId(String id) {
        person.setId(id);
        return this;
    }


    public PersonBuilder addSex(String sex) {
        person.setSex(sex);
        return this;
    }
    public PersonBuilder addIdNumber(String idNumber) {
        person.setIdNumber(idNumber);
        return this;
    }
    public PersonBuilder addCity(String city) {
        person.setCity(city);
        return this;
    }
    public PersonBuilder addBirth(String birth) {
        person.setBirth(birth);
        return this;
    }
    public PersonBuilder addName(String name) {
        person.setName(name);
        return this;
    }



    public Person builder() {
        return person;
    }
}
