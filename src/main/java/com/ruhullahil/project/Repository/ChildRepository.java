/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Repository;

import com.ruhullahil.project.Models.Child;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ruhul
 */
public interface ChildRepository extends JpaRepository<Child,Long>{
    
}
