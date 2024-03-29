package Ch17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class C05PropertiesMain {

	public static void main(String[] args) throws Exception {
		
		String classPath=System.getProperty("java.class.path");
//		System.out.println("classPath:"+classPath); //자바경로
		String dirPath=System.getProperty("user.dir");
//		System.out.println("dirPath:"+dirPath); //유저경로
		String pakagePath=C05PropertiesMain.class.getPackageName();
//		System.out.println("pakagePath:"+pakagePath); //패키지경로
		String filePath=dirPath + File.separator +"src"+File.separator+pakagePath+File.separator+"application.properties";
		System.out.println(filePath);
		
		Properties properties =new Properties();
		FileInputStream fin =new FileInputStream(filePath);
		properties.load(fin);
		
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		
		System.out.printf("%s\n %s\n %s\n",url,username,password);
	}

}
