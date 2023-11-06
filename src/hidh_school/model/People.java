package hidh_school.model;

import java.util.Objects;

public abstract class People implements Comparable<People> {

    // fields of class
    private int id;
    private String firstName;
    private String lastName;
    private String numberPhone;

    // constructor
    public People(int id, String firstName, String lastName, String numberPhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    // method toString
    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }

    // method equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        People people = (People) object;
        return id == people.id && Objects.equals(firstName, people.firstName) && Objects.equals(lastName, people.lastName) && Objects.equals(numberPhone, people.numberPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, numberPhone);
    }

    // method compareTo
    @Override
    public int compareTo(People o) {
        int res = this.lastName.compareTo(lastName);
            return res != 0 ? res : this.firstName.compareTo(firstName);
    }
}
// нужно сделать поля для Student, Aspirant Professor
