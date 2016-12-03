package com.youthia.youthia;

/**
 * Created by garia on 03-12-2016.
 */

public class User {
    public String reg_id, name, emailId, number, qualification, occupattion;

    public User() {
    }

    public User(String reg_id, String name, String emailId, String number, String qualification, String occupattion) {
        this.reg_id = reg_id;
        this.name = name;
        this.emailId = emailId;
        this.number = number;
        this.qualification = qualification;
        this.occupattion = occupattion;
    }

    public String getReg_id() {
        return reg_id;
    }

    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getOccupattion() {
        return occupattion;
    }

    public void setOccupattion(String occupattion) {
        this.occupattion = occupattion;
    }
}
