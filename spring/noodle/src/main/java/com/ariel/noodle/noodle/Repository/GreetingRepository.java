package com.ariel.noodle.noodle.Repository;

import com.ariel.noodle.noodle.Model.Greeting;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<Greeting, Long> {
    
    

}
