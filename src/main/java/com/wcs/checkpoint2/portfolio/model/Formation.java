package com.wcs.checkpoint2.portfolio.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Formation extends BaseModel implements Comparable<Formation> {

    private String name;
    private String schoolName;
    private String diploma;
    private Integer numberYearsAfterBac;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBegin;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;
    private String logo;


    public Formation() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public String getDiploma() { return diploma; }
    public void setDiploma(String diploma) { this.diploma = diploma; }
    public Integer getNumberYearsAfterBac() { return numberYearsAfterBac; }
    public void setNumberYearsAfterBac(Integer numberYearsAfterBac) { this.numberYearsAfterBac = numberYearsAfterBac; }

    public Date getDateBegin() { return dateBegin; }
    public void setDateBegin(Date dateBegin) { this.dateBegin = dateBegin; }
    public Date getDateEnd() { return dateEnd; }
    public void setDateEnd(Date dateEnd) { this.dateEnd = dateEnd; }
    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    @Override
    public int compareTo(Formation formation) {
        // from oldest to most recent
        //return this.getDateEnd().compareTo(formation.getDateEnd());

        // from most recent to oldest
        return formation.getDateEnd().compareTo(this.getDateEnd());
    }
}
