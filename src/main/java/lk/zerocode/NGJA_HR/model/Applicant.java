package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long vacancyId;
    private String name;
    private String nic;
    private String phone;
    private String email;
    private String resume;
    private LocalDate appliedDate;
    private String status;
}
