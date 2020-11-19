/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Controler;

import com.ruhullahil.project.Models.Child;
import com.ruhullahil.project.Models.Parent;
import com.ruhullahil.project.Repository.ChildRepository;
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
@RequestMapping(value = "/child")
public class ChildControler {
    @Autowired
    private ChildRepository repository;
  @GetMapping()
    List<Child>all(){
     return repository.findAll();
    }
    @PostMapping()
    Child newChild(@RequestBody Child newChild){
        return repository.save(newChild);
    }
    @GetMapping("/{id}")
    Child one(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow();
    }
      
}
