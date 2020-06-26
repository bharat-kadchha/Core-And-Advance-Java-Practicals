package object_mapper;

import java.io.IOException;


import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Demo {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String input = "{\"name\":\"bharat\",\"phoneNo\":1234567,\"ammount\":5200,\"status\":true}";

		ObjectMapper mapper = new ObjectMapper();

		Student value = mapper.readValue(input, Student.class);

		System.out.println(value.getAmmount());
		System.out.println(value.getPhoneNo());

		input = mapper.writeValueAsString(value);
		System.out.println(input);
	}

}
