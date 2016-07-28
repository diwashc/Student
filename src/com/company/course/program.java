/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.course;

import com.company.student.dao.StudentDAO;
import com.company.course.dao.impl.StudentDAOimpl;
import com.company.student.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Kabi
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentDAO courseDAO = new StudentDAOimpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Listing All");
            System.out.println("4. Search by id");
            System.out.println("5. Delete by id");
            System.out.println("6. Exit");
            System.out.println("Enter your choice[1-6]");
            //int ch=input.nextInt(); reducing one line code
            switch (input.nextInt()) {

                case 1:
                    System.out.println("Add Student");
                    Student s = new Student();
                    System.out.println("Enter ID");
                    s.setId(input.nextInt());
                    System.out.println("Enter Name");
                    s.setName(input.next());
                    System.out.println("Enter Level");
                    s.setLevel(input.next());
                    System.out.println("Enter Status");
                    s.setStatus(input.nextBoolean());

                    if (courseDAO.insert(s)) {
                        System.out.println("Inserted Succesfully");
                    } else {
                        System.out.println("Data Full");
                    }

                    break;

                case 2:
                    

                    break;

                case 3:
                    System.out.println("Listing all Students");
                    Student[] subjects = courseDAO.getAll();
                    for (int i = 0; i < subjects.length; i++) {
                        Student students = subjects[i];
                        if (students != null) {
                            System.out.println("ID" + students.getId());
                            System.out.println("Name" + students.getName());
                            System.out.println("Level" + students.getLevel());

                        }
                    }
                    break;

                case 4:
                    
                    System.out.println("Search by Id");
                   int id=input.nextInt();
                   Student students= courseDAO.getById(id);
                   if(students != null){
                       
                       System.out.println("ID"+ students.getId());
                       System.out.println("Name"+ students.getName());
                       System.out.println("Level"+ students.getLevel());
                       System.out.println("Status"+ students.isStatus());
                       
                   }
                   
                   
                    
                    
                         
                     
                    break;
                    
                case 5:
                    System.out.println("To Delete");
                    
                     id = input.nextInt();
                      System.out.println("Please Enter id ");
                    if (courseDAO.delete(id)) {
                        System.out.println("Deleted Succesfully");
                    }
                break;

                case 6:
                    System.out.println("Do you really want to exxit[y/n] ");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }
                    break;

            }
        }

    }

}
