package yevheniibudnyk.com.dao;

import org.springframework.stereotype.Repository;
import yevheniibudnyk.com.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakePersonDataAccessService implements PersonDAO {
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
