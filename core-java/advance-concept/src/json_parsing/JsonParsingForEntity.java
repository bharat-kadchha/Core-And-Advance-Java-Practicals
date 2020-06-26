package json_parsing;

import java.io.IOException;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class JsonParsingForEntity {

	public static void main(String[] args) throws JSONException, JsonProcessingException, IOException {

		// 1 method using org.json;

		String data = "{'foo':'bar','coolness':2.0, 'altitude':39000, 'pilot':{'firstName':'Buzz','lastName':'Aldrin'}, 'mission':'apollo 11'}";
		JSONObject object = new JSONObject(data);
		System.out.println(object);
		System.out.println(object.getString("pilot"));
		System.out.println(object.getJSONObject("pilot").getString("firstName"));

		// 2 method using com.google.gson

		String data1 = "{'foo':'bar','coolness':2.0, 'altitude':39000, 'pilot':{'firstName':'Buzz','lastName':'Aldrin'}, 'mission':'apollo 11'}";
		JsonParser parser = new JsonParser();
		JsonObject jsonObject = (JsonObject) parser.parse(data1);
		System.out.println(jsonObject);

		// 3 method object mapper

		String string = "{\"name\":\"mahesh\",\"age\":22}";
		ObjectMapper mapper = new ObjectMapper();

		Student student = mapper.readValue(string, Student.class);
		System.out.println(student.toString());

		string = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(string);

	}

}

class Student {
	private String name;
	private int age;

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return "Student [name=" + name + ", age=" + age + "]";
	}
}
