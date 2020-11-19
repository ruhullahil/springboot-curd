/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Controler;

import com.ruhullahil.project.Repository.ChildRepository;
import com.ruhullahil.project.Models.Parent;
import com.ruhullahil.project.Repository.ParentReposetory;
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
@RequestMapping(value = "/parent")
public class ParentControler {
    @Autowired
    private ParentReposetory parentrepo;

    public ParentControler(ParentReposetory parentrepo) {
        this.parentrepo = parentrepo;
    }
    

    
    
    @GetMapping()
    List<Parent>all(){
     return parentrepo.findAll();
    }
    @PostMapping()
    Parent newParent(@RequestBody Parent newParent){
        return parentrepo.save(newParent);
    }
    @GetMapping("/{id}")
    Parent one(@PathVariable Long id){
        return parentrepo.findById(id)
                .orElseThrow();
    }
    
    
    
    
}
