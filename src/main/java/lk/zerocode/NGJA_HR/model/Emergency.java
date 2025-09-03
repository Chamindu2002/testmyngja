package lk.zerocode.NGJA_HR.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Emergency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String contactNo1;
    private String contactNo2;
    @Column(length = 1000)
    private String medicalCondition;
    private String address;


}
