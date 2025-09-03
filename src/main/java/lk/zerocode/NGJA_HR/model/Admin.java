package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @OneToMany(mappedBy = "admin")
    private List<Leave> leaves=new ArrayList<>();
    private String AdminName;

}
