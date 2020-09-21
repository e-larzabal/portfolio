package com.wcs.checkpoint2.portfolio.model;

public enum RoleEnum {

    ADMIN("admin"),
    USER("user");

    private String role;

    RoleEnum(String role) {
        this.role = role;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }


    @Override
    public String toString() {
        //return super.toString();
        return this.getRole();
    }
}
