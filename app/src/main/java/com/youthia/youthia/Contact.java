package com.youthia.youthia;

/**
 * Created by garia on 21-11-2016.
 */

public class Contact {
private String name, occupation, contactNumber, regId;

    public Contact(String name, String occupation, String contactNumber, String regId) {
        this.name = name;
        this.occupation = occupation;
        this.contactNumber = contactNumber;
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }
}
