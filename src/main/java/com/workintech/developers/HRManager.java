package com.workintech.developers;

import java.util.ArrayList;

public class HRManager extends Employee {
    private ArrayList<JuniorDeveloper> juniorDevelopers = new ArrayList<>();
    private ArrayList<MidDeveloper> midDevelopers = new ArrayList<>();
    private ArrayList<SeniorDeveloper> seniorDevelopers = new ArrayList<>();

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(JuniorDeveloper developer) {
        if (!juniorDevelopers.contains(developer)) {
            juniorDevelopers.add(developer);
        } else {
            System.out.println("JuniorDeveloper is already in the list.");
        }
    }

    public void addEmployee(MidDeveloper developer) {
        if (!midDevelopers.contains(developer)) {
            midDevelopers.add(developer);
        } else {
            System.out.println("MidDeveloper is already in the list.");
        }
    }

    public void addEmployee(SeniorDeveloper developer) {
        if (!seniorDevelopers.contains(developer)) {
            seniorDevelopers.add(developer);
        } else {
            System.out.println("SeniorDeveloper is already in the list.");
        }
    }
}
