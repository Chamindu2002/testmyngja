package lk.zerocode.NGJA_HR.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PreviousWorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Employee employee;

    private String CompanyName;
    private String position;
    private String duration;
    private String serviceLetterPath;
    private String description;

}
