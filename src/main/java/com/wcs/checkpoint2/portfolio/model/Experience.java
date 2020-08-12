package com.wcs.checkpoint2.portfolio.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Experience extends BaseModel{

    private String profession;
    @Column(columnDefinition="VARCHAR(1500)")
    private String description;
    private String society;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBegin;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;
    private String logo;
    @Embedded
    private Address address;

    public Experience() { }

    public String getProfession() { return profession; }
    public void setProfession(String profession) { this.profession = profession; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getSociety() { return society; }
    public void setSociety(String society) { this.society = society; }
    public Date getDateBegin() { return dateBegin; }
    public void setDateBegin(Date dateBegin) { this.dateBegin = dateBegin; }
    public Date getDateEnd() { return dateEnd; }
    public void setDateEnd(Date dateEnd) { this.dateEnd = dateEnd; }
    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
