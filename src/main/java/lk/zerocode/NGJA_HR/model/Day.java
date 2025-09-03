package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lk.zerocode.NGJA_HR.model.enums.DayStatus;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Calendar calendar;


    private DayStatus status;
    private int dayNo;
    private LocalDate date;

}
