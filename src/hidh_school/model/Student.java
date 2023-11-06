package hidh_school.model;

import java.util.Objects;

public class Student extends People {

    // fields of class
    private int studentId;
    private String major;

    //constructor
    public Student(int id, String firstName, String lastName, String numberPhone, int studentId,String major) {
        super(id, firstName, lastName, numberPhone);
        this.studentId = studentId;
        this.major = major;
    }

    // getter and setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // method toString
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    // method
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Student student = (Student) object;
        return studentId == student.studentId && Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentId, major);
    }
}
