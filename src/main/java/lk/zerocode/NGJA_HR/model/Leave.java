package lk.zerocode.NGJA_HR.model;
import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.LeaveStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "employee_leave")
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Payroll payroll;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Admin admin;
    @ManyToOne
    private LeaveType type;


    private String leaveType;
    private String leaveDescription;
    private LocalDate startDate;
    private LocalDate endDate;
    private int  leaveDaysCount;
    private LeaveStatus leaveStatus;
    private LocalDateTime leaveRequestTime;
    private String adminName;

}
