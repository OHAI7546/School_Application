package model;

public class ClassRoom {

    private String className;
    private Teacher teacher;
    private Course course;

    public ClassRoom(String className, Teacher teacher, Course course) {
        this.className = className;
        this.teacher = teacher;
        this.course = course;
    }

    public void startClass() {
        System.out.println("Class " + className + " has started with " + teacher.getName() + " teaching " + course.getTitle());
    }
}
