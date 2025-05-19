package com.example.systemmonitor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.Instant;

@Entity
public class SystemStatus {
    @Id
    private Long id;
    private String machineId;
    private String os;
    private String diskEncryption;
    private String osUpdateStatus;
    private String antivirusStatus;
    private String sleepSetting;
    private Instant timestamp;

    // Getters and setters...
}
