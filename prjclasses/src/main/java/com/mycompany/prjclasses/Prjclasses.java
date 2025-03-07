/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class Prjclasses {

    public static void main(String[] args) {
        newClass nc = new newClass(); //creating an object of newClass
        
        nc.helloClass();// have to use variable name nc to communicate with the others
        
        System.out.println(nc.strSecondClassVariable);// output the variable from second class
    }
}
