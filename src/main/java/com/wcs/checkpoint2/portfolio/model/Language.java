package com.wcs.checkpoint2.portfolio.model;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Language extends BaseModel {

    private String name;
    @Column(columnDefinition="VARCHAR(1500)")
    private String description;
    private String level;

    public Language() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
}
