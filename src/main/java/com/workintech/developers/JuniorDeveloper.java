package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("JuniorDeveloper starts to working");
        this.setSalary(this.getSalary() * 1.1);
    }
}
