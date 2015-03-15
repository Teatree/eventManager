package textParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class TextParser {
	public Properties getFileProperties(String file){
		Properties properties = new Properties();
		try {
			FileInputStream input = new FileInputStream(file);
			properties.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return properties;
	}
	
	public static void main(String args[]){
		TextParser parser = new TextParser();
		Properties p = parser.getFileProperties("src/parserBitch.property");
		System.out.println(p.stringPropertyNames());
		for (final String s: p.stringPropertyNames()){
			System.out.println(s+" "+p.get(s));
		}
	}

}
