/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author ruhul
 */
@Entity
public class Parent extends BaseUser {
    private @Id @GeneratedValue Long p_id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Locations Address;
   
    public Parent(String FirstName, String Lastname) {
        super(FirstName, Lastname);
    }
   
    public Parent(){}
   @JsonCreator
    public Parent(Locations Address, String FirstName, String Lastname) {
        super(FirstName, Lastname);
        this.Address = Address;
    }
    
    public Locations getAddress() {
        return Address;
    }
    @JsonSetter
    public void setAddress(Locations Address) {
        this.Address = Address;
    }

    public Long getP_id() {
        return p_id;
    }

    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }

    
    
    
}
