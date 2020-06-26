package json_parsing;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonParsingDemo2 {

	public static void main(String[] args) throws JSONException {

		String input = "{\"name\":\"bharat\",\"phoneNo\":1234567,\"ammount\":[5200,3453],\"status\":true}";

		JSONObject object = new JSONObject(input);

		System.out.println(object.getInt("phoneNo"));

		System.out.println("length " + object.length());
		System.out.println(object.opt("name"));
		System.out.println(object.remove("hobby"));
		System.out.println(object);
		object.accumulate("ammount", 2345);
		object.append("ammount", 4560);
		object.append("email", "123@gmail.com");
		object.put("password", "@#VVBSK67");

		System.out.println(object);
		System.out.println(object.getJSONArray("ammount"));
		JSONArray a = (JSONArray) object.get("ammount");
		System.out.println(a.get(2)); // geting json array with index

		String s = "{\"name\":\"John\",\"age\":30,\"cars\": {\"car1\" : \"Ford\" , \"car2\" : \"BMW\" , \"car3\" : \"Fiat\" }}";

		JSONObject object3 = new JSONObject(s);
		JSONObject object5 = object3.getJSONObject("cars");
		Object object4 = object3.getJSONObject("cars").get("car1");
		System.out.println(object5);
		System.out.println(object4);

		String array = "{userInfo : [{username:abc123}, {username:xyz123},{username:pqr123},   {username:mno123},{username:jkl123}]}";

		JSONObject object2 = new JSONObject(array);

		JSONArray array2 = object2.getJSONArray("userInfo");

		for (int i = 0; i < array2.length(); i++) {
			System.out.println(array2.getJSONObject(i).get("username"));
		}

	}

}
