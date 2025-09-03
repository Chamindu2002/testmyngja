package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.MonthlyLeaveType;
import lombok.Data;

@Data
@Entity
public class MonthlyLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LeaveType leaveType;

    private MonthlyLeaveType type;
    private Double hours;
    private Integer leaveCount;
}
