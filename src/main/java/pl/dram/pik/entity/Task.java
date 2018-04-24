package pl.dram.pik.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="task")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private @NonNull String name;
}
