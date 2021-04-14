package com.perscholas.groupassignmenta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AdressBookOperations {
        // 1.print all available contacts, view ordered ascending by name then surname
    public static void readExistingContacts(String path) throws Exception {
        //parsing a CSV file into BufferedReader class constructor
        String line = "", splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] adressBook = line.split(splitBy);    // use comma as separator
                System.out.println("Name =" + adressBook[0] + ", Surname =" + adressBook[1] + ", Phone =" + adressBook[2] + ", Mobile=" + adressBook[3] + ", E-mail= " + adressBook[4] + ", Street= " + adressBook[5] + ", Number = " + adressBook[6] + ", Town = " +adressBook[7] + ", Zip = " +adressBook[8] );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Object String;
    public static String path1="src/main/resources/Users.txt";//, nameObj ="Pete";
    public static Scanner input;

    public static void searchAndUpdate(String nameObj)
    {
        boolean found = false;
        String name;
        try
        {
            input = new Scanner(new File(path1));
            input.useDelimiter("[,\n]");
            while (input.hasNext() && !found) {
                name = input.next();

                if (name.equals(nameObj)) {
                    found = true;
                }
            }
            if (found)
                System.out.println("found");
            else
                System.out.println("not found");
        }
        catch(Exception e){

        }
    }
}
