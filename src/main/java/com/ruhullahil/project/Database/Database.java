/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhullahil.project.Database;

import com.ruhullahil.project.Repository.ChildRepository;
import com.ruhullahil.project.Repository.LocationRepository;
import com.ruhullahil.project.Repository.ParentReposetory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author ruhul
 */
@Configuration
public class Database {
    private static final Logger log = LoggerFactory.getLogger(Database.class);
    
      @Bean
  CommandLineRunner initParent(ParentReposetory Parentrepo) {

    return args -> {
      //log.info("Preloading " + repository.save(new Parent()));
      //log.info("Preloading " + repository.save(new Parent("Frodo Baggins")));
    };
  }
      @Bean
  CommandLineRunner initChild(ChildRepository Parentrepo) {

    return args -> {
      //log.info("Preloading " + repository.save(new Parent()));
      //log.info("Preloading " + repository.save(new Parent("Frodo Baggins")));
    };
  }
      @Bean
  CommandLineRunner initLocation(LocationRepository Parentrepo) {

    return args -> {
      //log.info("Preloading " + repository.save(new Parent()));
      //log.info("Preloading " + repository.save(new Parent("Frodo Baggins")));
    };
  }
   
    
}
