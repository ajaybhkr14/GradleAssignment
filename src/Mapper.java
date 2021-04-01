
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
public class Mapper {
public static void main(String ar[]){
    String json = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"age\":34,\"location\":\"India\"}";

    ObjectMapper mapp = new ObjectMapper();
    try
    {
        Student emp = mapp.readValue(json, Student.class);

        System.out.println(emp);
    }        catch (JsonGenerationException e)
    {
        e.printStackTrace();
    } catch (JsonMappingException e) {
        e.printStackTrace();
    }catch (Exception e){

    }
}
}
