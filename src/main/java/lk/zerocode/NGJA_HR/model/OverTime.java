package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OverTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Payroll payroll;
    @ManyToOne
    private Employee employee;

    private double workingHours;
    private Double otHours;
}
