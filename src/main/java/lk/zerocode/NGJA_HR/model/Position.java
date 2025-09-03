package lk.zerocode.NGJA_HR.model;
import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.JobGrade;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long positionId;

    @ManyToOne
    private LeaveType leaveType;
    @ManyToOne
    @JoinColumn(name ="department_id")
    private Department department;

    @OneToMany(mappedBy = "position")
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "position_announcement",
            joinColumns = @JoinColumn(name = "position_id"),
            inverseJoinColumns = @JoinColumn(name = "announcement_id")
    )
    private List<Announcement> announcements = new ArrayList<>();

    private String name;
    private JobGrade grade;
    private String positionCode;
    private double basicSalary;

    @Column(length = 1000)
    private String description;


}
