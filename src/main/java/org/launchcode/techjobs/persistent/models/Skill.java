package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Description must be entered.")
    @Size(min = 5, max = 255, message = "Description must be between 5 and 255 characters.")
    private String description;

    public Skill() {}

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}