package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.CivilStatus;
import lk.zerocode.NGJA_HR.model.enums.Gender;
import lk.zerocode.NGJA_HR.model.enums.Nationality;
import lk.zerocode.NGJA_HR.model.enums.Religion;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private BiometricDetail biometricDetail;
    @OneToOne
    @JoinColumn(name="recruit_id")
    private Recruitment recruitment;
    @OneToOne
    @JoinColumn(name="financial_detail_id")
    private FinancialDetail financialDetail;
    @OneToOne
    @JoinColumn(name="emergency_contact_id")
    private Emergency emergency;

    @OneToMany(mappedBy = "employee")
    private List<EducationalDetails> educationalDetails =new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    private List<LegalDocs> legalDocs =new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    private List<FamilyDetails> familyDetails =new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    private List<PreviousWorkExperience> previousWorkExperience =new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    private List<Attendance> attendance = new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    private List<Leave> leaves = new ArrayList<>();
    @OneToMany(mappedBy = "employee")
    private List<OverTime> overTime = new ArrayList<>();

     @ManyToOne
     @JoinColumn(name = "position_id")
     private Position position;
     @ManyToOne
     @JoinColumn(name = "department_id")
     private Department department;


    private String employee Id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String mobileNumber;
    private String phoneNumber;
    private String email;
    private Nationality nationality;
    private Religion religion;
    private Gender gender;
    private String addressLine1;
    private String addressLine2;
    private String district;
    private  String imagePath;
    private String linkedInProfile;
    //@Enumerated(EnumType.STRING) // stores as text (SINGLE, MARRIED...)
    private CivilStatus civilStatus;




}
