package extract.values;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@SuppressWarnings("deprecation")
public class ApacheStanbolEntities extends GetAllImpValues {

	public static void getStanbolEntities(String fileType, String content) {
		
                //PropertyHandler ph=new PropertyHandler();
                String fileName= stanbolOPFile;
               // String stanbolInputFileName = ph.getDataToSearch();
                
                String data = getTextFromFile(fileType,content);
                String url ="http://demo.sigmoidanalytics.com:9191/enhancer/chain/dbpedia-spotlight";

	            @SuppressWarnings("resource")
				HttpClient client = new DefaultHttpClient();

		        try {
		            HttpPost post = new HttpPost(url);
		            HttpResponse response = null;
		         
		            Credentials defaultcreds = new UsernamePasswordCredentials("admin","admin");
		            post.addHeader( BasicScheme.authenticate(defaultcreds,"UTF8",false) );
		         
		            List <NameValuePair> parameters = new ArrayList <NameValuePair>();   
		            parameters.add(new BasicNameValuePair("data", data));
		          	             
		            UrlEncodedFormEntity sendentity = new UrlEncodedFormEntity(parameters);  
		            post.setEntity(sendentity);   
		          
		            HashMap<String,String> map = new HashMap<String,String>();
		            //Add Header
		            post.addHeader("Content-Type", "text/plain");
		            post.addHeader("Accept", "application/json");
		            StringEntity entity=new StringEntity(data);
		            entity.setContentType(new BasicHeader("Content-Type", "text/plain"));
		            post.setEntity(entity);
		            //send reqest
		            try{
		            	response=client.execute(post);
		            }
		            catch(Exception UnknownHostException){
		            	while(response!=null)
		            		response=client.execute(post);
		            }
		            System.out.println("!! Request sent to server : "+url);
		            if(response.getStatusLine().toString().contains("HTTP/1.1 200 OK"))
		            {    		            
			            InputStream stream=response.getEntity().getContent();
			            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
			            
			         	JSONParser parser=new JSONParser();

						Object obj=parser.parse(br);
						JSONObject object=(JSONObject) obj;
						
						JSONArray array1 = (JSONArray) object.get("@graph");
						for(int i=0;i<array1.size();i++)
						{
							JSONObject entity_refrence=(JSONObject) array1.get(i);
							
							if(entity_refrence.get("selected-text") !=null){
							JSONObject obj2 = (JSONObject) entity_refrence.get("selected-text");
							
							Object type = entity_refrence.get("type");
							if(type==null){
								type = "Others";
							}
							map.put(obj2.get("@value").toString(), type.toString());
							}
						}
						
										
						FileWriter file = new FileWriter(fileName);
						for(Entry<String,String> en : map.entrySet()){

							file.write(en.getValue() + " : " + en.getKey()+ " \n \n");
						}
						file.flush();
						file.close();
						br.close();
						
						System.out.println("!!! Data Saved in file : "+fileName);
			         
			        	stream.close();
		            }
		            else
		            {
		            	System.out.println(" Unauthorized Access");
		            }
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        finally{
		        	client.getConnectionManager().shutdown();
		        }
		    }

	@SuppressWarnings("resource")
	private static String getTextFromFile(String fileType, String content) {

		String data = "";
		
		BufferedReader reader = null;
		try {
			if(fileType.endsWith("pdf")){
				return content;
			}
			else if(fileType.endsWith("txt")){
				reader = new BufferedReader(new FileReader(inputTxtFile));
			}
			else if(fileType.endsWith("html")|fileType.endsWith("htm")|fileType.endsWith("cms")){
				reader = new BufferedReader(new FileReader(cleanTextOP));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	   
	    String line;
	    try {
			while ((line = reader.readLine()) != null) {
				data += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
		
	}
}