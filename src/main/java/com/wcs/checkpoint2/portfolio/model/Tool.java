package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Entity;

@Entity
public class Tool extends BaseLogoModel implements Comparable<Tool> {

    public Tool() { }

    @Override
    public int compareTo(Tool tool) {
        return this.getOrder().compareTo(tool.getOrder());
    }
}
