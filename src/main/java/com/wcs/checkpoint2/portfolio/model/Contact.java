package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
//@Table(name="contact")
public class Contact extends BaseModel {
//public class Contact {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    private String firstName;
    private String lastName;
    private ZonedDateTime birthDate;
    private String githubLink;
    private String linkedInLink;

    @Embedded
    private Address address;


  /*  public Contact(Long id, String firstName, String lastName, ZonedDateTime birthDate, String githubLink, String linkedInLink, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.githubLink = githubLink;
        this.linkedInLink = linkedInLink;
        this.address = address;
    }*/

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public ZonedDateTime getBirthDate() { return birthDate; }

    public void setBirthDate(ZonedDateTime birthDate) { this.birthDate = birthDate; }

    public String getGithubLink() { return githubLink; }

    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }

    public String getLinkedInLink() { return linkedInLink; }

    public void setLinkedInLink(String linkedInLink) { this.linkedInLink = linkedInLink; }

    public Address getAddress() { return address; }

    public void setAddress(Address address) { this.address = address; }
}
