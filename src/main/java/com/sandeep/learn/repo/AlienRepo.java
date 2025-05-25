package com.sandeep.learn.repo;

import com.sandeep.learn.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    List<Alien> findByTech(String java);
}
