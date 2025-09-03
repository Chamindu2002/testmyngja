package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class FinancialDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "financialDetail")
    private List<BankDetail> bankDetails= new ArrayList<>();

    private String epfNo;
    private String etfNo;
    private String tinNumber;
    private String taxFileNumber;

}
