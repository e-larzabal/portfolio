package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role extends BaseModel {
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();

    public Role() { }

    public String getName() { return name; }
    public void setName(String role) { this.name = role; }
    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users; }

}
