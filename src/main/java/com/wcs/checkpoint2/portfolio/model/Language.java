package com.wcs.checkpoint2.portfolio.model;


import javax.persistence.Entity;

@Entity
public class Language extends BaseLogoModel implements Comparable<Language> {

    private String level;

    public Language() { }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    @Override
    public int compareTo(Language language) {
        return this.getOrder().compareTo(language.getOrder());
    }
}
