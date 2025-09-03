package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branchCode;
    private String branchName;
    private String branchAddressLine1;
    private String branchAddressLine2;
    private String District;
    private String TelephoneNo;
    private int employeeCount;
    private  String branchManagerId;

}
