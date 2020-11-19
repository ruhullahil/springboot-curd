/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author ruhul
 */
@Entity
public class Locations  {
    
    private @Id @GeneratedValue Long id;
    private String State;
    private String City ;
    private String Stree;
    private int Zip;

    public Locations() {
    }
    
    @JsonCreator
    public Locations(String State, String City, String Stree, int Zip) {
        
        this.State = State;
        this.City = City;
        this.Stree = Stree;
        this.Zip = Zip;
    }
   
    public String getState() {
        return State;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }
    
    public void setCity(String City) {
        this.City = City;
    }

    public String getStree() {
        return Stree;
    }
    
    public void setStree(String Stree) {
        this.Stree = Stree;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.State);
        hash = 13 * hash + Objects.hashCode(this.City);
        hash = 13 * hash + Objects.hashCode(this.Stree);
        hash = 13 * hash + this.Zip;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locations other = (Locations) obj;
        if (this.Zip != other.Zip) {
            return false;
        }
        if (!Objects.equals(this.State, other.State)) {
            return false;
        }
        if (!Objects.equals(this.City, other.City)) {
            return false;
        }
        if (!Objects.equals(this.Stree, other.Stree)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locations{" + "id=" + id + ", State=" + State + ", City=" + City + ", Stree=" + Stree + ", Zip=" + Zip + '}';
    }
    
    
    
}
