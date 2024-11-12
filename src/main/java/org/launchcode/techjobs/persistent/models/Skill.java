package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Skill must be entered and not left empty.")
    @Size(max = 1111, message = "Employer cannot exceed 1111 characters.")
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill() {
    }
}
