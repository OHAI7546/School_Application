package model;

import baseClass.SchoolMember;

public class Teacher extends SchoolMember {

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teachCourse(Course course) {
        System.out.println(getName() + " is teaching " + course.getTitle());
    }
}



