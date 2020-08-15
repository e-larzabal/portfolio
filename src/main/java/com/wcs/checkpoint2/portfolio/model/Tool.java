package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Entity;

@Entity
public class Tool extends BaseModel{
    private String name;
    private String logo;

    public Tool() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLogo() { return "/img/"+logo; }
    public void setLogo(String logo) { this.logo = logo; }
}
