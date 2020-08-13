package com.wcs.checkpoint2.portfolio.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class BaseModel {

    @Id
    @Type(type="uuid-char")
    protected UUID uuid;

    @Column(columnDefinition="VARCHAR(1500)")
    private String description;

    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}