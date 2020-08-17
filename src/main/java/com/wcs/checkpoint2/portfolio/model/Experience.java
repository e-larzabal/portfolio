package com.wcs.checkpoint2.portfolio.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Experience extends BaseLogoModel implements Comparable<Experience>{

    private String society;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBegin;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;
    @Embedded
    private Address address;

    public Experience() { }

    public String getSociety() { return society; }
    public void setSociety(String society) { this.society = society; }
    public Date getDateBegin() { return dateBegin; }
    public void setDateBegin(Date dateBegin) { this.dateBegin = dateBegin; }
    public Date getDateEnd() { return dateEnd; }
    public void setDateEnd(Date dateEnd) { this.dateEnd = dateEnd; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Override
    public int compareTo(Experience experience) {
        // from oldest to most recent
        //return this.getDateEnd().compareTo(experience.getDateEnd());

        // from most recent to oldest
        return experience.getDateEnd().compareTo(this.getDateEnd());
    }

}
