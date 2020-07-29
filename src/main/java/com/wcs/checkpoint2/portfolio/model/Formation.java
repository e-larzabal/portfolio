package com.wcs.checkpoint2.portfolio.model;


import javax.persistence.Entity;

@Entity
public class Formation extends BaseModel{

    private String name;
    private String description;
    private String schoolName;
    private String diploma;
    private Integer numberYearsAfterBac;
    //private Date dateObtained = DateTimeFormatter.BASIC_ISO_DATE;
    //private String logo;


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) { this.schoolName = schoolName; }
    public String getDiploma() { return diploma; }
    public void setDiploma(String diploma) { this.diploma = diploma; }
    public Integer getNumberYearsAfterBac() { return numberYearsAfterBac; }
    public void setNumberYearsAfterBac(Integer numberYearsAfterBac) { this.numberYearsAfterBac = numberYearsAfterBac; }
}
