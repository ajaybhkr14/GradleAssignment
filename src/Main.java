public class Main {

    public static void main(String ar[]) {
        String json = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"age\":34,\"location\":\"India\"}";
        Mapper obj =new Mapper();
        obj.Map(json);
    }
    }
