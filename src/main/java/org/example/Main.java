package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AddDeveloper addDeveloper = new AddDeveloper();
        PrintDeveloper printDeveloper = new PrintDeveloper();
        DeleteDeveloper deleteDeveloper = new DeleteDeveloper();

        //add developers
        addDeveloper.addDeveloper("John", "Mobile", 7000);

        //print developer's list
        List<Developer> developers = printDeveloper.getAllDevelopers();
        for (Developer developer : developers) {
            System.out.println(developer.getName() + " - " + developer.getSpecialty() + " - " + developer.getSalary());
        }

        //delete developers
        deleteDeveloper.deleteDeveloper(1);

        //print updated developer's list
        List<Developer> developers1 = printDeveloper.getAllDevelopers();
        for (Developer developer : developers1) {
            System.out.println(developer.getName() + " - " + developer.getSpecialty() + " - " + developer.getSalary());
        }
    }
}