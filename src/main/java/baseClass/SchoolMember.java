package baseClass;

public abstract class SchoolMember {

    private String name;
    private int age;

    public SchoolMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
