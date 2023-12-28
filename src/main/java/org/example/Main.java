package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddDeveloper addDeveloper = new AddDeveloper();
        PrintDeveloper printDeveloper = new PrintDeveloper();
        DeleteDeveloper deleteDeveloper = new DeleteDeveloper();

        //add developers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name: ");
        String name = scanner.nextLine();
        System.out.println("Insert specialty: ");
        String specialty = scanner.nextLine();
        System.out.println("Insert salary: ");
        double salary = scanner.nextDouble();
        addDeveloper.addDeveloper(name, specialty, salary);

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