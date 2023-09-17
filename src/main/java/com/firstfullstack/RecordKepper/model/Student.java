package com.firstfullstack.RecordKepper.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This is a JPA entity class which helps when trying to an entity in a database
 * @Author Leslie Ejeh
 * @Version 1.0
 */

@Entity
public class Student {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private int id; // primary Key
    private String name;
    private String address;

    private String major;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //Yet to implement
    public String getMajor() {
        return major;
    }



}
