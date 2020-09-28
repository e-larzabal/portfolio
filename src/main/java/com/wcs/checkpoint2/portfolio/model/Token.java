package com.wcs.checkpoint2.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Token extends BaseLogoModel{
    private static final int EXPIRATION = 60 * 24;
    private String token;
    private Date expiryDate;
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_uuid")
    private User user;

    public Token() { }
    public Token(String token, User user) { }

    public static int getEXPIRATION() { return EXPIRATION; }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    private Date calculateExpiryDate(int expiryTimeInMinutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }
}
