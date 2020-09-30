package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Role extends BaseModel {
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "role_privilege",
            joinColumns = @JoinColumn(name = "role_uuid", referencedColumnName = "uuid"),
            inverseJoinColumns = @JoinColumn(name = "privilege_uuid", referencedColumnName = "uuid"))
    private List<Privilege> privileges;

    public Role() { }
    public Role(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String role) { this.name = role; }
    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users; }
    public List<Privilege> getPrivileges() { return privileges; }
    public void setPrivileges(List<Privilege> privileges) { this.privileges = privileges; }
}
