package hidh_school.model;

import java.util.Objects;

public class Aspirant extends People{

    // field of class
    private int aspirantId;
    private String major;

    // constructor
    public Aspirant(int id, String firstName, String lastName, String numberPhone, int aspirantId, String major) {
        super(id, firstName, lastName, numberPhone);
        this.aspirantId = aspirantId;
        this.major = major;
    }

    // getter and setter
    public int getAspirantId() {
        return aspirantId;
    }

    public void setAspirantId(int aspirantId) {
        this.aspirantId = aspirantId;
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
        return "Aspirant{" +
                "aspirantId=" + aspirantId +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    // method equals and hashCode
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Aspirant aspirant = (Aspirant) object;
        return aspirantId == aspirant.aspirantId && Objects.equals(major, aspirant.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), aspirantId, major);
    }
}

