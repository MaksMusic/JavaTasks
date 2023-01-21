package Collections_and_Array.SearchPhoneNumber;

import java.util.ArrayList;

public class PhoneDictionary {
    ArrayList<Person> persons = new ArrayList<>();

    {
        persons.add(new Person("1User1", "UserSurname5", "10000000000", "City1"));
        persons.add(new Person("2User2", "UserSurname4", "20000000000", "City2"));
        persons.add(new Person("3User3", "UserSurname3", "30000000000", "City3"));
        persons.add(new Person("4User5", "UserSurname2", "40000000000", "City4"));
        persons.add(new Person("Tomas", "UserSurname1", "50000000000", "City5"));
        persons.add(new Person("Katy", "UserSurname1", "50000000000", "City5"));
        persons.add(new Person("Anna", "UserSurname1", "50000000000", "City5"));
    }


    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person it : persons) {
            if (it.getAddress().contains(key) ||
                    it.getNumperPhone().contains(key) ||
                    it.getName().contains(key) ||
                    it.getSurName().contains(key)) {
                result.add(it);

            }
        }
        return result;

    }
}
