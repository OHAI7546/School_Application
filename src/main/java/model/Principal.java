package model;

import baseClass.SchoolMember;

public class Principal extends SchoolMember {

    public Principal(String name, int age) {
        super(name, age);
    }

    public void expelStudent(Student student) {
        System.out.println(getName() + " has expelled " + student.getName());
    }

    public void admitApplicant(Applicant applicant) {
        if (applicant.getAge() >= 18) {
            System.out.println(getName() + " has admitted " + applicant.getName());
        } else {
            System.out.println(applicant.getName() + " is too young for admission.");
        }
    }
}
