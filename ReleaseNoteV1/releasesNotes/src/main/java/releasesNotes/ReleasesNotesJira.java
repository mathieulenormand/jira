package releasesNotes;

import java.net.URI;
import java.net.URISyntaxException;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;

public class ReleasesNotesJira {
//	private static final String JIRA_URL2 = ConfProperties.url3;
	private static final String JIRA_URL = "http://localhost:8080";
    private static final String JIRA_ADMIN_USERNAME = "mlenormand";
    private static final String JIRA_ADMIN_PASSWORD = "#########";
    private String project2;
    private String version;
    private ConfProperties confProperties2;
    
    
	public ReleasesNotesJira(String project2) throws URISyntaxException {
		super();
		this.confProperties2= new ConfProperties();
		this.project2 = this.jrProject(project2);
		
	}
//	public ReleasesNotesJira(String project) throws URISyntaxException {
//		final JiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
//		  final URI uri = new URI(JIRA_URL);
//	      final JiraRestClient client = factory.createWithBasicHttpAuthentication(uri, JIRA_ADMIN_USERNAME, JIRA_ADMIN_PASSWORD);
//	      Promise<SearchResult> searchJqlPromise = client.getSearchClient().searchJql("project ="+project);
//	        for (Issue issue2 : searchJqlPromise.claim().getIssues()) {
//	            System.out.println(issue2.getSummary());
//	        }
//	      }
	public String jrProject (String project2) throws URISyntaxException {
		final JiraRestClientFactory factory = new AsynchronousJiraRestClientFactory();
		  final URI uri = new URI(JIRA_URL);
	      final JiraRestClient client = factory.createWithBasicHttpAuthentication(uri, confProperties2.getUsername(), JIRA_ADMIN_PASSWORD);
	      Promise<SearchResult> searchJqlPromise = client.getSearchClient().searchJql("project ="+project2);
	        for (Issue issue2 : searchJqlPromise.claim().getIssues()) {
	            System.out.println(issue2.getSummary());
	        }
			return project2;
	}
	public String jrVersion (String version) {
		
		return version;
	}
}