package com.wcs.checkpoint2.portfolio.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Project extends BaseLogoModel implements Comparable<Project> {

    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateBegin;
    @Basic
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateEnd;
    private String link;
    private String document;
    private String github;

    public Project() { }

    public Date getDateBegin() { return dateBegin; }
    public void setDateBegin(Date dateBegin) { this.dateBegin = dateBegin; }
    public Date getDateEnd() { return dateEnd; }
    public void setDateEnd(Date dateEnd) { this.dateEnd = dateEnd; }
    public String getLink() { return link; }
    public void setLink(String link) { this.link = link; }
    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }

    @Override
    public int compareTo(Project project) {
        return this.getOrder().compareTo(project.getOrder());
    }
}
