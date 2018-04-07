package Entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Wojtek on 2018-04-07.
 */
@Entity
@Table(name = "Personal_information")
@DynamicUpdate
public class PersonalInformation {
    @Id
    @Column(name = "info_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "infoid_generator")
    @SequenceGenerator(name = "infoid_generator", initialValue = 1, allocationSize = 1, sequenceName = "infoid_seq")
    private int infoId;

    @Column(name = "PESEL")
    private int pesel;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "birth_place")
    private String birthPlace;


}
