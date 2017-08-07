import java.io.*;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class JavatoJSON{
  public static void main(String[] args){
    ObjectMapper mapper = new ObjectMapper();
    Animal henry = new Animal("Henry", "Hippo", 3);

    //Converting a Java object to a JSON string
    String jsonString;
    try{
      jsonString = mapper.writeValueAsString(henry);
      System.out.println(jsonString);
    } catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    String jsonInString = "{\"name\": \"Dave\", \"type\": \"Duck\", \"age\": 2}";

    //Convert to the Java object
    try{
      Animal duck = mapper.readValue(jsonInString, Animal.class);
      System.out.println(duck.name);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
