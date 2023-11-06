package hidh_school.test;

import hidh_school.dao.HighSchool;
import hidh_school.dao.HighSchoolImpl;
import hidh_school.model.Aspirant;
import hidh_school.model.People;
import hidh_school.model.Professor;
import hidh_school.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighSchoolImplTest {

    HighSchool highSchool;
    People[] people;

    @BeforeEach
    void setUpTest() {
        highSchool = new HighSchoolImpl(4);
        people = new People[3];
        people[0] = new Student(101, "Ivan", "Ivanov", "096358742", 123659713, "Doctor");
        people[1] = new Aspirant(102, "Peter", "Petrov", "097123456", 556423987, "Surgeon");
        people[2] = new Professor(103, "Fedor", "Fedorov", "096852741", 357951456, "Surgeon");

        for (int i = 0; i < people.length; i++) {
            highSchool.addPeople(people[i]);
        }
    }

    @Test
    void addPeopleTest() {
        // null
        assertFalse(highSchool.addPeople(null));
        // not add existing
        assertFalse(highSchool.addPeople(people[1]));
        // add people
        People people1 = new Student(104, "Masha", "Lucky", "095123789", 951846753, "Nurse");
        assertTrue(highSchool.addPeople(people1));
        // cannot to exceeded capacity
        People people2 = new Student(105, "Dina", "Lucky", "094753962", 124578360, "Nurse");
        assertFalse(highSchool.addPeople(people2));
    }

    @Test
    void findPeopleTest() {
        // find people
        assertEquals(people[1], highSchool.findPeople(102));
    }

    @Test
    void  removePeopleTest() {
        // remove people
        assertTrue(highSchool.removePeople(102));
        // not find remove people
        assertNull(highSchool.findPeople(102));
    }

    @Test
    void quantityTest() {
        // size
        assertEquals(3, highSchool.quantity());
    }

    @Test
    void findPeopleByNumberPhoneTest() {
        // find people by number phone
        People[] expected = highSchool.findPeopleByNumberPhone("096358742");
        People[] actual = {people[0]};
        assertArrayEquals(expected, actual);
    }
}