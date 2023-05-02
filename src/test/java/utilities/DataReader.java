package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DataReader {
		
		private static Properties property;
			
			static {
				try {
					File file = new File("./src/tets/resources/testdata/env.properties");
					FileInputStream input = new FileInputStream(file);
					property = new Properties();
					property.load(input);
					input.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//whatever data we want to get from the resources package we ask for it
			// in this case is String 
			// we call it from variable property 
			
			public static String getProperty(String key) {
				return property.getProperty(key);
			}


		}


