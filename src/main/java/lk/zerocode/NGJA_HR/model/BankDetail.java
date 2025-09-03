package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BankDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @ManyToOne
    private FinancialDetail financialDetail;

    private String swiftCode;
    private String bankName;
    private String bankBranch;
    private String bankAccountNumber;





}
