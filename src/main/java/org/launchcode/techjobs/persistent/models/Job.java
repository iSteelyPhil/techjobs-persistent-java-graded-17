package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.


    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

}
