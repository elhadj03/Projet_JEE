package com.masterips.ProjetJEE.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masterips.ProjetJEE.modele.Monument;

public interface MonumentRepository extends JpaRepository<Monument, String>{

}
