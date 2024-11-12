package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<>();

    @NotNull
    @Size(min = 1, max = 50)
    private String location;

    public Employer () {};

    public @NotNull @Size(min = 1, max = 50) String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(min = 1, max = 50) String location) {
        this.location = location;
    }
}
