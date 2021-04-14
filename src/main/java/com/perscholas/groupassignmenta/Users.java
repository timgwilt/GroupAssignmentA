package com.perscholas.groupassignmenta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Users implements User {

    File user = new File("/Users/snajjper1/IdeaProjects/GroupAssignmentA/src/main/resources/Users.txt");

    public Users() throws FileNotFoundException {
    }

    Scanner data = new Scanner(user);


    @Override
    public void show_all_users() {
        try {
            Scanner line = new Scanner(user);
            while (line.hasNextLine()) {
                String el = line.nextLine();
                String[] next = el.split(",");
                System.out.printf("%s %n", Arrays.toString(next));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}

