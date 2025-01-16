package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("SeniorDeveloper starts to working");
        this.setSalary(this.getSalary() * 1.3);
    }
}
