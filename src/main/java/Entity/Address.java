package Entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * Created by Wojtek on 2018-04-07.
 */
@Entity
@Table(name = "Address")
@DynamicUpdate
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressid_generator")
    @SequenceGenerator(name = "addressid_generator", initialValue = 1, allocationSize = 1, sequenceName = "addressid_seq")
    private int addressId;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "zip_code")
    private int zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private int phoneNumber;
}
