package lk.zerocode.NGJA_HR.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Payroll payroll;


    private LocalDateTime inTime;
    private LocalDateTime outTime;
    private double workingHours;



}
