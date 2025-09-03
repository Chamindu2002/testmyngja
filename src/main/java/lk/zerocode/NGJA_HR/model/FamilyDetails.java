package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.RelationType;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class FamilyDetails {

    //todo  spouse and parents
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    private RelationType relationType;
    private String Name;
    private LocalDate Dob;
    private String Job;
    private int age;


}
