package com.yearup;

public class CellPhoneApp {
    public static void main(String[] args) {

        CellPhone myPhones[] = new CellPhone[3];

        myPhones[0] = new CellPhone(
                "1000000 -9999999",
                "iPhone 14 Pro Max",
                "AT&T",
                "347-432-3542",
                "Dana Wyatt");
        myPhones[1] = new CellPhone(
                "1000000 -9999999",
                "iPhone X",
                "AT&T",
                "800-555-5555",
                "Dana Wyatt");
        myPhones[2] = new CellPhone(
                "1076543 -9993339",
                "iPhone 13",
                "Verizon",
                "800-555-5555",
                "Dana Wyatt");

        for (CellPhone c: myPhones){
            System.out.printf("%s belongs to %s", c.getModel(),c.getOwner() + "\n");

        }
    }
}