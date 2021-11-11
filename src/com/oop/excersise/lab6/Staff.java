package com.oop.excersise.lab6;

import java.time.LocalDate;
import java.util.List;

public class Staff extends Person {
    private LocalDate joined;
    private List<String> education;
    private List<String> certification;
    private List<String> languages;

    public LocalDate getJoined() {
        return joined;
    }

    public void setJoined(LocalDate joined) {
        this.joined = joined;
    }

    public List<String> getEducation() {
        return education;
    }

    public void setEducation(List<String> education) {
        this.education = education;
    }

    public List<String> getCertification() {
        return certification;
    }

    public void setCertification(List<String> certification) {
        this.certification = certification;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
