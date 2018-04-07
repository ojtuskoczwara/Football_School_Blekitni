package Entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by Wojtek on 2018-04-07.
 */
@Entity
@Table(name = "Person")
@DynamicUpdate
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personid_generator")
    @SequenceGenerator(name = "personid_generator", initialValue = 1, allocationSize = 1, sequenceName = "personid_seq")
    private int personId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "surname")
    private String surname;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
