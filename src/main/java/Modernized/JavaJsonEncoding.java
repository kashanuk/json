package Modernized;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

public class JavaJsonEncoding {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> file = new HashMap<>();

        file.put("Full Name", "Ritu Sharma");
        file.put("Roll No.", 1704310046);
        file.put("Tuition Fees", 65400.0);

        String json = mapper.writeValueAsString(file);
        System.out.println(json);
    }
}
