import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
           JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();

           String name = "Billy";
           BigDecimal decimal = BigDecimal.valueOf(18.5);

           JsonObject json = jsonObjectBuilder.add("name", name).
                   add("some number", decimal).
                   add("A value", "Very nice").build();
           
           System.out.println(json);
    }
}