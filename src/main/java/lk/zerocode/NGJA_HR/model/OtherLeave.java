package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.OtherLeaveType;
import lombok.Data;

@Data
@Entity
public class OtherLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private LeaveType leaveType;

    private OtherLeaveType type;
    private Integer leaveCount;
}
