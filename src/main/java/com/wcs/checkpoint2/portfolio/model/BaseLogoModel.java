package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseLogoModel extends BaseModel{

    private String name;
    private String logo;
    @Column(name="orderView")
    private Integer order;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }
    public Integer getOrder() { return order; }
    public void setOrder(Integer order) { this.order = order; }

    public String getLogoPath() { return "/img/"+logo; }

}
