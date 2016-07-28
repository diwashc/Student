/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.student.dao;

import com.company.student.entity.Student;

/**
 *
 * @author Kabi
 */
public interface StudentDAO {
     boolean insert(Student p);
     boolean update(Student p);
     boolean delete(int id);
     Student getById(int id);
     Student[] getAll();
    
}
