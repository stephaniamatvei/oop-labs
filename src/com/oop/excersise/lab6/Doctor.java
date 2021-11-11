package com.oop.excersise.lab6;

import java.util.List;

public class Doctor extends OperationsStaff {
    private List<String> speciality;
    private List<String> locations;

    public List<String> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(List<String> speciality) {
        this.speciality = speciality;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}
