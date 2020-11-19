/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Models;

/**
 *
 * @author ruhul
 */
public class BaseUser {
    private String FirstName;
    private String Lastname;

    public BaseUser() {
    }
    

    public BaseUser(String FirstName, String Lastname) {
        this.FirstName = FirstName;
        this.Lastname = Lastname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }
    
    
    
    
}
