package Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/hello")
    public String getStartPage() {
        return "Hello!";
    }

    @RequestMapping("/persons")
    public List<Person> findAllPersons() {
        return personService.findAllPersons();
    }

    @GetMapping("/persons/{id}")
    public Person findPerson(@PathVariable UUID id) {
        return personService.findPerson(id);
    }

    @PostMapping(value = "/persons")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @PutMapping("/persons/{id}")
    public void updatePerson(Person person){
        personService.updatePerson(person);
    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable UUID id) {
        personService.deletePerson(id);
    }
}
