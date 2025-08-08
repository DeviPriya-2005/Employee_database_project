package com.example.DeviDB.RepoDB;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DeviDB.EntityDB.Entityclass;

public interface Repointerface extends JpaRepository<Entityclass,Integer>{

}
