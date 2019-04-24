import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.LocalDate;

public class Person {

    @JsonbProperty("name")
    private String name;

    @JsonbTransient
    private String eyeColour;

    @JsonbDateFormat("dd-MM-yyyy")
    private LocalDate registeredDate;

    @JsonbProperty(nillable = true)
    private String email;

    @JsonbProperty("age")
    private int age;

    public Person(){
    }

    public Person(String name, String eyeColour, LocalDate registeredDate, String email, int age) {
        this.name = name;
        this.eyeColour = eyeColour;
        this.registeredDate = registeredDate;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", registeredDate=" + registeredDate +
                ", email='" + email + '\'' +
                ", age=" + age;
    }
}
