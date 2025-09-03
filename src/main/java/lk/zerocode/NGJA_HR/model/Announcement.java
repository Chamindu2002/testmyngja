package lk.zerocode.NGJA_HR.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "announcements")
    private List<Position> positions = new ArrayList<>();


    private String title;
    private String description;
    private LocalDateTime publishDate;
    private LocalDateTime expDate;
    private String status;
}
