package releasesNotes;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;


public class ConfProperties {

    private String url;
    private String username;
    private String password;
    private List<String> IssueTypes;
    private List<String> IssueStates;

	
    public ConfProperties() {
		super();
	}
    
    public ConfProperties(String path) {
		this();
		this.url = path;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public List<String> getIssueTypes() {
		return IssueTypes;
	}

	public List<String> getIssueStates() {
		return IssueStates;
	}

	public void loadProperties() {
		Properties prop = new Properties();
		try {
			// load a properties file for reading
			prop.load(new FileInputStream("src/main/resources/config.properties"));
			// get the properties and print
//			prop.list(System.out);
			//Reading each property value
			this.url=prop.getProperty("config.url");
			if(url==null || url.length()==0) {
			System.out.println("pas présent");
			}else
				new URL(url);
					System.out.println(prop.getProperty("config.url"));
			
			this.username=prop.getProperty("config.login");
				if(username==null || username.length()==0) {
					System.out.println("pas present username");
				}else
					System.out.println(prop.getProperty("config.login"));
				
			this.password=prop.getProperty("config.password");
				if(password==null || password.length()==0) {
					System.out.println("pas present password");
				}else
					System.out.println(prop.get("config.password"));
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
