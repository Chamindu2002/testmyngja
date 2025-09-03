package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy="calendar")
    private List<Day> days = new ArrayList<>();

    private int workingDaysCount;
    private int publicHolidayCount;
    private int weekendDaysCount;
    private int year;
    private int month;

}
