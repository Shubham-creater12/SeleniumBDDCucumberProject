package PropertyFileStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFrom_Property_File {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop= new Properties();
		
		FileInputStream obj = new FileInputStream("E:\\Workspace2\\batch_4_6_Evening_Selenium\\src\\PropertyFileStudy\\MyProperty.properties");

		prop.load(obj);
		
		String value1 = prop.getProperty("URLDEV");
		System.out.println(value1);
		System.out.println(prop.getProperty("Mob"));
		
	}

}
