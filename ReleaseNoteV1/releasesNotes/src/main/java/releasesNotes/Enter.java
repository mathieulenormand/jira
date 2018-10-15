package releasesNotes;

import java.net.URISyntaxException;

public class Enter {

	public static void main(String[] args) throws ExceptionProperties, URISyntaxException {
		
//		ConfProperties conf = new ConfProperties("e");
//		conf.loadProperties();
		
		new ReleasesNotesJira("ARCAD");
		
	}

}
