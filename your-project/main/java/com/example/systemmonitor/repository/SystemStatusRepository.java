package com.example.systemmonitor.repository;

import com.example.systemmonitor.entity.SystemStatus;  // Add this import
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SystemStatusRepository extends JpaRepository<SystemStatus, Long> {  // Use Long here
    List<SystemStatus> findByOsContainingIgnoreCase(String os);
}
