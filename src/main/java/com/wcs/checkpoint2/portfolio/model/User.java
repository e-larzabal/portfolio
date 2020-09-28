package com.wcs.checkpoint2.portfolio.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class User extends BaseModel implements Serializable, UserDetails {
    @Column(nullable = false, unique = true)
    private String username;
    private String password;

   /* private String firstName;
    private String lastName;
    private String email;*/

    /*@ManyToMany
    @JoinTable(name="user_role",
            joinColumns = @JoinColumn(name="user_uuid"),
            inverseJoinColumns = @JoinColumn(name="role_uuid"))
    private List<Role> roles = new ArrayList<>();

    private boolean enabled = true;
    private boolean accountNonExpired = true;
    private boolean credentialsNonExpired = true;
    private boolean accountNonLocked = true;*/

    public User() { }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
   /* public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Role> getRoles() {
        return this.roles;
    }
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public boolean isAccountNonExpired() { return accountNonExpired; }
    public void setAccountNonExpired(boolean accountNonExpired) { this.accountNonExpired = accountNonExpired; }
    public boolean isCredentialsNonExpired() { return credentialsNonExpired; }
    public void setCredentialsNonExpired(boolean credentialsNonExpired) { this.credentialsNonExpired = credentialsNonExpired; }
    public boolean isAccountNonLocked() { return accountNonLocked; }
    public void setAccountNonLocked(boolean accountNonLocked) { this.accountNonLocked = accountNonLocked; }*/


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
