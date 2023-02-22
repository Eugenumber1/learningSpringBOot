package yevheniibudnyk.com.api;

import yevheniibudnyk.com.model.Person;
import yevheniibudnyk.com.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
