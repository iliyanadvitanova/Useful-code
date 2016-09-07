import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.*;
import org.json.simple.parser.*;

public class JasonSimpleExample {
	public static void main(String[] args) {

		JSONParser parser = new JSONParser();

		try {
			Object obj =  parser.parse(new FileReader("test.json"));
			JSONObject jsonObject = (JSONObject) obj;

			String name;
			try {
				name = (String) jsonObject.get("name");
				System.out.println(name);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			long age;
			try {
				age = (Long) jsonObject.get("age");
				System.out.println(age);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

			// loop array
			JSONArray msg;
			try {
				msg = (JSONArray) jsonObject.get("messages");
				Iterator<String> iterator = (Iterator<String>) msg;
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}