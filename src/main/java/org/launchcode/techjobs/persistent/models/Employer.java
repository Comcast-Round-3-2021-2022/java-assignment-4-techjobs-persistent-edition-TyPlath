package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {}


    @NotBlank(message = "Location must be entered")
    @Size(min = 5, max = 40, message = "Location must be between 5 and 40 characters")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return location;
    }
}
