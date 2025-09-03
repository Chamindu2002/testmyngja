package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Recruitment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branch;
    private String department;
    private LocalDateTime dataOfJoin;
    private String position;


}
