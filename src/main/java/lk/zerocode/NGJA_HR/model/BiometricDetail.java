package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class BiometricDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "biometricDetail")
    private Employee employee;

    private String fingerPrintId;
    private String fingerprint1;
    private String fingerprint2;
    private String deptCode;

}
