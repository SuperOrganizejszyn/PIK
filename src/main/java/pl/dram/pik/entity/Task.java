package pl.dram.pik.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="task")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private @NonNull String name;
//    private String description;
//    private @NonNull Date startDate;
//    private @NonNull Date endDate;
//    private List<Date> notifiesDate;
}
