package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity
public class Contact extends BaseModel {
    private String firstName;
    private String lastName;
    private ZonedDateTime birthDate;
    private String githubLink;
    private String linkedInLink;

    @Embedded
    private Address address;


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
