package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() * 1.10); // Maaş %10 artırılır
        System.out.println("MidDeveloper is working. Salary updated to: " + getSalary());
    }
}
