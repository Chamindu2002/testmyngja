package lk.zerocode.NGJA_HR.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;

    @OneToMany(mappedBy = "department")
    private List<Position> positions = new ArrayList<>();
    @OneToMany(mappedBy = "department")
    private List<Employee> employees = new ArrayList<>();

    private String deptName;
    private int noOfEmployee;
    private String deptLocation;
    private String deptTel;
    private String managerId;

    @Column(length = 1000)
    private String deptDescription;
    
}
