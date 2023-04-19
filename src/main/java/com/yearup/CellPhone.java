package com.yearup;

public class CellPhone {
    private String serialnumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public CellPhone(String serialnumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialnumber = serialnumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
}
