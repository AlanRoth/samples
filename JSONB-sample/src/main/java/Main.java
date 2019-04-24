import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Frank",
                "Blue",
                LocalDate.now(),
                null,
                21);

        Person person2 = new Person("Billy",
                "Brown",
                LocalDate.of(2019, 1, 23),
                "Billy@gmail.com",
                35);

        Jsonb jsonb = JsonbBuilder.create();

        //From Person object to JSON
        String jsonPerson = jsonb.toJson(person1);

        //Printing to show converion from Person object to JSON
        System.out.println(jsonPerson);
        System.out.println(jsonb.toJson(person2));

        //From JSON string to Person object
        Person person = jsonb.fromJson(jsonPerson, Person.class);
        System.out.println(person.toString());

    }
}
