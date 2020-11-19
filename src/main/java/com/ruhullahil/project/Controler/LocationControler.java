/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Controler;

import com.ruhullahil.project.Repository.LocationRepository;
import com.ruhullahil.project.Models.Locations;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ruhul
 */
@RestController
@RequestMapping(value = "/location")
public class LocationControler {
    
    @Autowired
    private LocationRepository reposetory;

    public LocationControler(LocationRepository reposetory) {
        this.reposetory = reposetory;
    }
      @GetMapping
    List<Locations>all(){
     return reposetory.findAll();
    }
    @PostMapping
    Locations newLocation(@RequestBody Locations newLocations){
        System.out.println(newLocations.toString());
        return reposetory.save(newLocations);
    }
    @GetMapping("/{id}")
    Locations one(@PathVariable Long id){
        return reposetory.findById(id)
                .orElseThrow();
    }
}
