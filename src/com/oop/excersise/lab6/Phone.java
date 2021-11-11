package com.oop.excersise.lab6;

public class Phone {
    private String telephonePrefix;
    private String telephoneNumber;

    public Phone(String telephonePrefix, String telephoneNumber) {
        this.telephonePrefix = telephonePrefix;
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephonePrefix() {
        return telephonePrefix;
    }

    public void setTelephonePrefix(String telephonePrefix) {
        this.telephonePrefix = telephonePrefix;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
