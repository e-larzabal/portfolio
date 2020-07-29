package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Column;

public class Address {

    @Column(nullable = false)
    private String line1;
    @Column(nullable = false)
    private String line2;
    @Column(nullable = false)
    private String city;
    private int zipCode;

    public String getLine1() {
        return line1;
    }
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    public String getLine2() {
        return line2;
    }
    public void setLine2(String line2) {
        this.line2 = line2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
