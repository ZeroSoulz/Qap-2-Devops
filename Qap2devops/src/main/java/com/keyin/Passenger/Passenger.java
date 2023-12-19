package com.keyin.Passengers;
import com.keyin.Aircraft.Aircraft;
import com.keyin.City.City;

import javax.persistence.*;
import java.util.List;
@Entity
public class Passenger {
    @Id
    @SequenceGenerator(name = "passenger_sequence", sequenceName = "passenger_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "passenger_sequence")
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToOne
    private City City;
    @OneToMany
    private List<Aircraft> Aircraft;




    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
