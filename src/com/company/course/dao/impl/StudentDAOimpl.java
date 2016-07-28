/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.course.dao.impl;

import com.company.student.dao.StudentDAO;
import com.company.student.entity.Student;

/**
 *
 * @author Kabi
 */
public class StudentDAOimpl implements StudentDAO {
    private int counter=1;
    private Student[] studentList= new Student[10];

    @Override
    public boolean insert(Student p) {
        if(counter==studentList.length){
            return false;
        }
        studentList[counter]=p;
        counter++;
        return true;
    }

    @Override
    public boolean update(Student p) {
        return true;
    }

    @Override
    public boolean delete(int id) {
         for(int i=0;i<studentList.length;i++){
        Student p=studentList[i];
        if(p!=null && p.getId()==id){
            studentList[i]=null;
            return true;
        
        }
    
    }
         return false;
    }

    @Override
    public Student getById(int id) {
             for(int i=0;i<studentList.length;i++){
        Student p=studentList[i];
        if(p!=null && p.getId()==id){
            studentList[i]=null;
            return p;
        
        }
    
    }
         return null;
        
    }

    @Override
    public Student[] getAll() {
        return studentList;
    }
    
}
