package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.AnnualLeaveType;
import lombok.Data;

@Data
@Entity
public class AnnualLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LeaveType leaveType;

    private AnnualLeaveType type;
    private Integer leaveCount;
}
