/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Models;

import com.ruhullahil.project.Models.Parent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ruhul
 */
@Entity
public class Child extends BaseUser  {
    private @Id @GeneratedValue Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Parent parent;
   @JsonCreator
    public Child(Parent parent, String FirstName, String Lastname) {
        super(FirstName, Lastname);
        this.parent = parent;
    }

    public Child(String FirstName, String Lastname) {
        super(FirstName, Lastname);
    }
    public Child(){}

    public Parent getParent() {
        return parent;
    }
    
    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
    
    
}
