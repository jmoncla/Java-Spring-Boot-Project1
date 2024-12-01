package com.d288.james.dao;

import com.d288.james.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface ExcursionRepository extends JpaRepository<Excursion, Long >{
}
