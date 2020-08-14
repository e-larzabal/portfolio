package com.wcs.checkpoint2.portfolio.model;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Language extends BaseModel {

    private String name;
    private String level;
    private String logo;

    public Language() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getLogo() { return "/img/"+logo; }
    public void setLogo(String logo) { this.logo = logo; }
}
