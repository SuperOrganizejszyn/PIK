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
    private Long id;
    private @NonNull String name;
    private String description;
    private Date startDate;
    private Date endDate;
//    private List<Date> notifiesDate;
}
