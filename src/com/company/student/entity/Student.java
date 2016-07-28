/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.student.entity;

/**
 *
 * @author Kabi
 */
public class Student {
    private int id;
    private String name;
    private String Level;
    private boolean status;

    public Student() {
    }

    public Student(int id, String name, String description, String teacherName, boolean status) {
        this.id = id;
        this.name = name;
        
        this.Level = Level;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getLevel() {
        return Level;
    }

    public void setLevel(String teacherName) {
        this.Level = Level;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
