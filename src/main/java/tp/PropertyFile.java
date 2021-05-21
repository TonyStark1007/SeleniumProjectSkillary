package tp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements Constant {
public String getData(String key) throws FileNotFoundException, IOException {
	Properties pro=new Properties();
	pro.load(new FileInputStream(propertypath));

	return 	pro.getProperty(key);
}
}
