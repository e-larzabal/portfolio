package com.wcs.checkpoint2.portfolio.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Project extends BaseModel{
    private String name;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBegin;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;
    private String logo;
    private String link;

    public Project() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Date getDateBegin() { return dateBegin; }
    public void setDateBegin(Date dateBegin) { this.dateBegin = dateBegin; }
    public Date getDateEnd() { return dateEnd; }
    public void setDateEnd(Date dateEnd) { this.dateEnd = dateEnd; }
    public String getLogo() { return "/img/"+logo; }
    public void setLogo(String logo) { this.logo = logo; }
    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }
}
