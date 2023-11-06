package hidh_school.dao;

import hidh_school.model.People;

public interface HighSchool {

    boolean addPeople(People people);
    People findPeople(int id);
    Boolean removePeople(int id);
    int quantity();
    People[] findPeopleByNumberPhone(String numberPhone);
}
