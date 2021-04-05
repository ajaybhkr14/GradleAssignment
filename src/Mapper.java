
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    public void Map(String json){
        ObjectMapper mapp = new ObjectMapper();
        try {
            Student emp = mapp.readValue(json, Student.class);

            System.out.println(emp);
        } catch (Exception e) {

        }
    }
}
