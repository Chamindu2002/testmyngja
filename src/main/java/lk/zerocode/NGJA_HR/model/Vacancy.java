package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String department;
    private String location;
    private String jobDescription;
    private String qualificationRequired;
    private LocalDate applicationDeadline;
    private String status;
}
