/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamavaran.server.vasat.test1;

import com.hamavaran.server.vasat.test.TestApi;

/**
 *
 * @author jeus
 */
public class TestApi1 {
    
    int id;
    int age;
    String name;
    String lastName;
    TestApi api = new TestApi();

    public TestApi1(String name, String lastName, int age, int id , TestApi api) {
        System.out.println("-----------------------------------");
        this.id = id;
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.api = api;
        System.out.println("Dare call mishe :)");
    }
    
    public TestApi1(String name, String lastName, int age, int id) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    public TestApi1(String name, String lastName, int age) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        System.out.println("DARE CALL MISHE");
    }

    public TestApi getApi() {
        return api;
    }

    public void setApi(TestApi api) {
        this.api = api;
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
