package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Employer must be entered and not left empty.")
    @Size(max = 111, message = "Employer cannot exceed 111 characters.")
    @Column(name = "location")
    private String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Employer(){
    }
}
