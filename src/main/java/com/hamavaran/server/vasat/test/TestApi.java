/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamavaran.server.vasat.test;

/**
 *
 * @author jeus
 */
public class TestApi {

    int id;
    int age;
    String name;
    String lastName;

    public TestApi(String name, String lastName, int age, int id) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public TestApi(String name, String lastName, int age) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        System.out.println("DARE CALL MISHE");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
