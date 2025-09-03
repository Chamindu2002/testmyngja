package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class LegalDocs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;


    private Long empId;
    private String passportNo;
    private String passportExp;
    private String passportImg;
    private String drivingLicenceNo;
    private String drivingLicenceExp;
    private String drivingLicenceImg;
    private String nationalIdNo;
    private String nicImg;
    private String contractId;
    private String contractIdExp;
    private String contractIdImg;
    private String birthCertificateImg;
    private String policeReportImg;
    private String marriageCertificateImg;
}
