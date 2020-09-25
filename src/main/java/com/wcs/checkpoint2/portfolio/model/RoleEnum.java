package com.wcs.checkpoint2.portfolio.model;

public enum RoleEnum {

    ADMIN("ADMIN","Admin"),
    USER("USER", "User");

    private String role;
    private String label;

    RoleEnum(String role, String label) {
        this.role = role;
        this.label = label;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    @Override
    public String toString() {
        //return super.toString();
        return this.getRole();
    }
}
