package com.example.systemmonitor.repository;

import com.example.systemmonitor.entity.SystemStatus; 
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
//repository for CRUD operations
public interface SystemStatusRepository extends JpaRepository<SystemStatus, Long> {  
    List<SystemStatus> findByOsContainingIgnoreCase(String os);
}
