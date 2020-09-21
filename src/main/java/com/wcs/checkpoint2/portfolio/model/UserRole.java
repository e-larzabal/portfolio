package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="userRole")
public class UserRole extends BaseModel {
    private String role;

    @ManyToOne
    private User user;

    public UserRole() { }

    public UserRole(String role,User user) {
        this.role = role;
        this.user = user;
    }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
