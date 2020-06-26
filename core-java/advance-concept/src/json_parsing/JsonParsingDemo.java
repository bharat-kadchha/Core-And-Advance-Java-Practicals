package json_parsing;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonParsingDemo {

	public static void main(String[] args) {

		String input = "{\"name\":\"bharat\",\"phoneNo\":1234567,\"ammount\":[5200,3453],\"status\":true}";

		JsonParser jsonParser = new JsonParser();

		JsonElement element = jsonParser.parse(input);
		JsonObject Object = element.getAsJsonObject();// 1st way
		JsonObject jsonObject = (JsonObject) jsonParser.parse(input);// 2nd way

		System.out.println(jsonObject.get("name").getAsString());
		System.out.println(jsonObject.get("phoneNo").getAsFloat());
		System.out.println(jsonObject.getAsJsonObject());

	}
}
