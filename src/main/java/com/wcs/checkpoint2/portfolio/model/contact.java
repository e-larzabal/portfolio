package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity
public class contact extends BaseModel {
    private String firstName;
    private String lastName;
    private ZonedDateTime birthDate;
    private String githubLink;
    private String linkedInLink;

    @Embedded
    private Address address;
}
