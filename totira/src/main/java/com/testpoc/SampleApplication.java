package com.testpoc;

import java.net.MalformedURLException;

import org.apache.commons.lang.StringUtils;
import org.realtors.rets.client.CommonsHttpClient;
import org.realtors.rets.client.RetsException;
import org.realtors.rets.client.RetsHttpClient;
import org.realtors.rets.client.RetsSession;
import org.realtors.rets.client.RetsVersion;
import org.realtors.rets.client.SearchRequest;
import org.realtors.rets.client.SearchResultImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleApplication {
	
//	$login_url = "http://demo.crt.realtors.org:6103/rets/login";	$username = "Joe";	$password = 'Schmoe';	$user_agent = "RETSMD/1.0";	$rets_version = "1.5";}
	
//	http://retsau.torontomls.net:6103/rets-treb3pv/server/login
//		username : EV19pho
//		password : 4M$9h53
	
	public static void main(String[] args) throws MalformedURLException {

		//Create a RetsHttpClient (other constructors provide configuration i.e. timeout, gzip capability)
		RetsHttpClient httpClient = new CommonsHttpClient();
		RetsVersion retsVersion = RetsVersion.RETS_10;
		String loginUrl = "http://retsau.torontomls.net:6103/rets-treb3pv/server/login";

		//Create a RetesSession with RetsHttpClient
		RetsSession session = new RetsSession(loginUrl, httpClient, retsVersion);    

		String username = "EV19pho";
		String password = "4M$9h53";

		//Set method as GET or POST
		session.setMethod("POST");
		try {
			//Login
			System.out.println("Before login");
			session.login(username, password);
			System.out.println("After login");

		} catch (RetsException e) {
			System.out.println("exception while login");
			e.printStackTrace();
		}

		//String sQuery = "(Member_num=.ANY.)";
		//String sQuery = "(status=|1)";
		String sQuery = "(Area_code=01)";
		String sResource = "Property";
		//String sClass = "Residential";
		//String sClass = "tt_res";
		String sClass = "ResidentialProperty";

		//Create a SearchRequest
		SearchRequest request = new SearchRequest(sResource, sClass, sQuery);
		System.out.println("check 1");

		//Select only available fields
		//String select ="field1,field2,field3,field4,field5";
		String select ="field4";
	//	request.setSelect(select);
		System.out.println("check 2");
		//Set request to retrive count if desired
		request.setCountFirst();
		System.out.println("check 3");
		SearchResultImpl response;
		try {
			//Execute the search
			response= (SearchResultImpl) session.search(request);
			System.out.println("check 4");
			System.out.println("check 5:"+response.getRowCount());
			System.out.println("check 6:"+response.toString());
			System.out.println("check 7:");
			//Print out count and columns
			int count = response.getCount();
			System.out.println("COUNT: " + count);
			System.out.println("COLUMNS: " + StringUtils.join(response.getColumns(), "\t"));

			//Iterate over, print records
			for (int row = 0; row < response.getRowCount(); row++){
				System.out.println("ROW "+ row +": " + StringUtils.join(response.getRow(row), "\t"));
			}
		} catch (RetsException e) {
			e.printStackTrace();
		} 
		finally {
			if(session != null) { 
				try {
					session.logout(); 
				} 
				catch(RetsException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
