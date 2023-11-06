package hidh_school.model;

import java.util.Objects;

public class Professor extends People {

    // fields of class
    private int professorId;
    private String major;

    //constructor
    public Professor(int id, String firstName, String lastName, String numberPhone, int professorId, String major) {
        super(id, firstName, lastName, numberPhone);
        this.professorId = professorId;
        this.major = major;
    }

    // getter and setter
    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
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
        return "Professor{" +
                "professorId=" + professorId +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    // method
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Professor professor = (Professor) object;
        return professorId == professor.professorId && Objects.equals(major, professor.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), professorId, major);
    }
}
