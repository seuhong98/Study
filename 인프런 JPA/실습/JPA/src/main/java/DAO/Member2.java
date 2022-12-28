package DAO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor
@SequenceGenerator(
        name = "Member2_Sequence",
        initialValue = Integer.MIN_VALUE,
        allocationSize = 50
)
public class Member2 {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,
    generator = "Member2_Sequence")
    private Long id;
    private String name;

    public Member2() {}
}
