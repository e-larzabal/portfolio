package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.sql.Date;


@Entity
public class Contact extends BaseModel {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String githubLink;
    private String linkedInLink;
    private String profession;
    private String email;

    @Embedded
    private Address address;



    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }
    public String getGithubLink() { return githubLink; }
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }
    public String getLinkedInLink() { return linkedInLink; }
    public void setLinkedInLink(String linkedInLink) { this.linkedInLink = linkedInLink; }
    public String getProfession() { return profession; }
    public void setProfession(String function) { this.profession = function; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public String getAddressString() {
        this.address = getAddress();

        return this.address.getLine1()+"<br>"+this.address.getLine2()+"/n"+this.address.getZipCode()+" "+this.address.getCity();

    }
}
