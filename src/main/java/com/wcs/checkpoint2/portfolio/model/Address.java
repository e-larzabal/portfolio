package com.wcs.checkpoint2.portfolio.model;



public class Address {

    private String line1;
    private String line2;
    private String city;
    private Integer zipCode;
    private String phone;
    private String country;

    public Address() { }

    public Address(String line1, String line2, String city, Integer zipCode, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

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
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public String getPhone() { return phone; }
    public String getPhoneWithoutSpace() { return phone.replaceAll(" ","").replace("(0)",""); }
    public void setPhone(String phone) { this.phone = phone; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
}
