package model;

import baseClass.SchoolMember;

public class Student extends SchoolMember {

    public Student(String name, int age) {
        super(name, age);
    }

    public void takeCourse(Course course) {
        System.out.println(getName() + " is taking " + course.getTitle());
    }
}
