package com.it.extend;

public class Teacher extends Person{
    private String skills;

    public Teacher() {
    }

    public Teacher(String skills) {
        this.skills = skills;
    }

    public Teacher(String name, int age, String gender, String skills) {
        super(name, age, gender);
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
