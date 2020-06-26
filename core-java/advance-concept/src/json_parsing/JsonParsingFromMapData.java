package json_parsing;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonParsingFromMapData {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "bharat");
		map.put("phNo", "1234567");

		ObjectMapper mapper = new ObjectMapper();

		@SuppressWarnings("deprecation")
		String string1 = mapper.defaultPrettyPrintingWriter().writeValueAsString(map);
		String string2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(string1);
		System.out.println(string2);
	}
}
