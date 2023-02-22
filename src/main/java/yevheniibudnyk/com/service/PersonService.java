package yevheniibudnyk.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import yevheniibudnyk.com.dao.PersonDAO;
import yevheniibudnyk.com.model.Person;

import java.util.UUID;

@Service
public class PersonService {

    private final PersonDAO personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDAO personDao){
        this.personDao = personDao;
    }
    public int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return personDao.insertPerson(id, person);
    }
}
