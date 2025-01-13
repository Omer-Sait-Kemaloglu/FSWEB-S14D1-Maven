package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.15); // Maaş %15 artırılır
        System.out.println("SeniorDeveloper is working. Salary updated to: " + getSalary());
    }
}
