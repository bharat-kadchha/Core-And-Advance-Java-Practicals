package objectMapper;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonMapper {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		JsonMapper jsonMapper = new JsonMapper();
		Student std = new Student();
		std.setAmmount(1243);
		std.setName("rahul");
		std.setPhoneNo(234567);
		std.setStatus(true);
		jsonMapper.writeJSON(std);
		System.out.println(jsonMapper.toString());

		Student s1 = jsonMapper.readJSON();
		System.out.println(s1.toString());

	}

	private void writeJSON(Student student) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("student.json"), student);
	}

	private Student readJSON() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("student.json"), Student.class);
		return student;
	}

}
