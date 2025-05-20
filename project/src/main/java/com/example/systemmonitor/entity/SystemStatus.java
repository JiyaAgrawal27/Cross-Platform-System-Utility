package com.example.systemmonitor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.Instant;

@Entity
    // This is to map to a table 
public class SystemStatus {
    //variables for the dashboard as per the requirements
    @Id
    private Long id;
    private String machineId;
    private String os;
    private String diskEncryption;
    private String osUpdateStatus;
    private String antivirusStatus;
    private String sleepSetting;
    private Instant timestamp;
}
