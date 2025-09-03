package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.sql.ast.tree.expression.Over;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "employee")
    private Employee employee;

    @OneToMany(mappedBy = "payroll")
    private List<Attendance> attendances=new ArrayList<>();

    @OneToMany(mappedBy = "payroll")
    private List<OverTime> overTime = new ArrayList<>();

    @OneToMany(mappedBy = "payroll")
    private List<Leave> leaves = new ArrayList<>();



    private Double basicSalary;
    private Double bonus;
    private Double allowance;
    private Double grossSalary;
    private Double noPay;
    private Double loan;
    private Double tax;
    private Double epf;
    private Double netSalary;
    private String status;
}
