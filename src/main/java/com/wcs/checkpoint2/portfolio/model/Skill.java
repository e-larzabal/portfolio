package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Entity;

@Entity
public class Skill extends BaseLogoModel implements Comparable<Skill> {

    private String iconClass;

    public String getIconClass() { return iconClass; }
    public void setIconClass(String iconClass) { this.iconClass = iconClass; }

    public Skill() { }

    @Override
    public int compareTo(Skill tool) {
        return this.getOrder().compareTo(tool.getOrder());
    }
}
