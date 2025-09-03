package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.EducationQualification;
import lk.zerocode.NGJA_HR.model.enums.ExamStatus;
import lombok.Data;

@Data
@Entity
public class EducationalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee  employee;

    //private String employeeId;
    private EducationQualification educationQualification;
    private String degree_Name;
    private String year;
    private ExamStatus status;
    private String certificate_Path;


}
