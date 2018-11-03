package com.tuyano.spring.boot.myapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceDataRepository extends JpaRepository<PlaceData, Long>{

}
