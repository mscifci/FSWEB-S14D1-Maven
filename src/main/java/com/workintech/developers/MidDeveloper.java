package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("MidDeveloper starts to working");
        this.setSalary(this.getSalary() * 1.2);
    }
}
