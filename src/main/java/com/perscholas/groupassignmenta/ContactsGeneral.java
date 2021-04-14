package com.perscholas.groupassignmenta;

public class ContactsGeneral {
    private String name, surname,phNumber,email,street,hNumber,town,zip;
    public ContactsGeneral(){}
    public ContactsGeneral(String name, String surname, String phNumber, String email, String street, String hNumber, String town, String zip) {
        this.name = name;
        this.surname = surname;
        this.phNumber = phNumber;
        this.email = email;
        this.street = street;
        this.hNumber = hNumber;
        this.town = town;
        this.zip = zip;
    }
    public boolean equals(ContactsGeneral c) {
        if(name.equals(c.name) && surname.equals(c.surname)
                && phNumber.equals(c.phNumber) && email.equals(c.email)&& street.equals(c.street)&& hNumber.equals(c.hNumber)&& town.equals(c.town)&& zip.equals(c.zip))
            return true;
        return false;
    }
    public String toString(){
        return name+","+surname+","+phNumber+","+","+email+","+","+street+","+","+hNumber+","+","+town+","+","+zip;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPhNumber() {
        return phNumber;
    }
    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String gethNumber() {
        return hNumber;
    }
    public void sethNumber(String hNumber) {
        this.hNumber = hNumber;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


}
