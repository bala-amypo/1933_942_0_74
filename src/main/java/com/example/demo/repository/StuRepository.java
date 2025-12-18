package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StuEntity;

@Repository
public interface StuRepository extends JpaRepository<StuEntity, Long> {
}
