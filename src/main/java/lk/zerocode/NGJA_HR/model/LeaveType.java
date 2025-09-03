package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class LeaveType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "type")
    private List<Leave> leaves=new ArrayList<Leave>();

    @OneToMany(mappedBy = "leaveType")
    private List<Position> positions = new ArrayList<>();

    @OneToMany(mappedBy = "leaveType")
    private List<AnnualLeave> annualLeaves = new ArrayList<>();
    @OneToMany(mappedBy = "leaveType")
    private List<MonthlyLeave> monthlyLeaves = new ArrayList<>();
    @OneToMany(mappedBy = "leaveType")
    private List<OtherLeave> otherLeaves = new ArrayList<>();









    //private Long positionId;
}
