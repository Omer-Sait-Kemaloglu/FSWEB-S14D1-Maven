package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.05); // Maaş %5 artırılır
        System.out.println("JuniorDeveloper is working. Salary updated to: " + getSalary());
    }
}
