package hidh_school.dao;

import hidh_school.model.People;

import java.util.Arrays;
import java.util.Comparator;

public class HighSchoolImpl implements HighSchool {

    // fields of class
    private People[] peoples; // arrays for storing people
    private int size; // current number of people in the High school

    // constructor
    public HighSchoolImpl(int capacity) {
        peoples = new People[capacity];
    }

    static Comparator<People> comparator = (p1, p2) -> {
        return Integer.compare(p1.getId(), p2.getId());
    };

    @Override
    public boolean addPeople(People people) {
        if (people == null || size == peoples.length || findPeople(people.getId()) != null) {
            return false;
        }
        // find index
        int index = Arrays.binarySearch(peoples, 0, size, people, comparator);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(peoples, index, peoples, index + 1, size - index);
        peoples[index] = people;
        size++;
        return true;
    }

    @Override
    public People findPeople(int id) {
        for (int i = 0; i < size; i++) {
            if (peoples[i].getId() == id) {
                return peoples[i];
            }
        }
        return null;
    }

    @Override
    public Boolean removePeople(int id) {
        for (int i = 0; i < size; i++) {
            if (peoples[i].getId() == id) {
                System.arraycopy(peoples, i + 1, peoples, i, size - 1 - i);
                peoples[--size] = null; // set the last element not null
                return true;
            }
        }
        return false;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public People[] findPeopleByNumberPhone(String numberPhone) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (peoples[i].getNumberPhone().equals(numberPhone)) {
                count++;
            }
        }
        People[] res = new People[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (peoples[i].getNumberPhone().equals(numberPhone)) {
                res[j++] = peoples[i];
            }
        }
        return res;
    }
}