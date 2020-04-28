package com.example.demo.repository;

import com.example.demo.repository.resources.LogTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogTableRepository extends JpaRepository<LogTableEntity, Integer> {
}
