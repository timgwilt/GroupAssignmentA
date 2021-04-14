package com.perscholas.groupassignmenta;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserContacts {
    private String name;
    private String surname;
    private String phone;
    private String mobile;
    private String email;
    private String street;
    private String number;
    private String tTown;
    private String zip;

    public UserContacts() {
    }

    public UserContacts(String name, String surname, String phone, String mobile, String email, String street, String number, String tTown, String zip) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.street = street;
        this.number = number;
        this.tTown = tTown;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return name.trim() + ','
                + surname.trim() + ','
                + phone.trim() + ','
                + mobile.trim() + ','
                + email.trim() + ','
                + street.trim() + ','
                + number.trim() + ','
                + tTown.trim() + ','
                + zip.trim();
    }

    public ArrayList<UserContacts> getUsers() throws FileNotFoundException {
        //String[] line;
        Scanner s = new Scanner(new File("src/main/resources/Users.txt"));
        ArrayList<UserContacts> users = new ArrayList<UserContacts>();
        while (s.hasNext()) {
            String[] line = s.nextLine().split(",");
            UserContacts user = new UserContacts(line[0], line[1], line[2], line[3], line[4], line[4], line[6], line[7], line[8]);
            users.add(user);
        }
        return users;
    }

    public EditUsers removeUser() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/Users.txt"));
        EditUsers<UserContacts> remove = new EditUsers<UserContacts>() {
            @Override
            public void manipulate(ArrayList<UserContacts> u, String v) throws IOException {
                for (int i = 0; i < u.size(); i++) {
                    if (!u.get(i).name.trim().equals(v)) {
                        //System.out.println(u.get(i).name);
                        try {
                            writer.write(u.get(i).toString() + "\n");
                            writer.flush();
                        } catch (IOException ex) {
                        }
                    }
                }
                writer.close();
            }
        };
        return remove;
    }

}
