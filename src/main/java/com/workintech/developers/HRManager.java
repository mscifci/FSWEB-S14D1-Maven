package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for(int i = 0; i < this.juniorDevelopers.length; ++i) {
            if (this.juniorDevelopers[i] == null) {
                this.juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }

        System.out.println("Junior developer array is full");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for(int i = 0; i < this.midDevelopers.length; ++i) {
            if (this.midDevelopers[i] == null) {
                this.midDevelopers[i] = midDeveloper;
                return;
            }
        }

        System.out.println("Mid developer array is full");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for(int i = 0; i < this.seniorDevelopers.length; ++i) {
            if (this.seniorDevelopers[i] == null) {
                this.seniorDevelopers[i] = seniorDeveloper;
                return;
            }
        }

        System.out.println("Senior developer array is full");
    }

    public void work() {
        System.out.println("HRManager starts to working");
    }
}
