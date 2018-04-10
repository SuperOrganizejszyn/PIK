package pl.dram.pik.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="task")
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private @NonNull String name;
}
