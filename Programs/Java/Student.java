public class Student {
    private String id;
    private String name;
    private String course;

    // Constructor
    public Student(String id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Regents Student ID: " + id + "\nName: " + name + "\nCourse: " + course;
    }
}
