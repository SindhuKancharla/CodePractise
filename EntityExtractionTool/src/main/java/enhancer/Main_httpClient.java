package enhancer;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipart;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import utils.PropertyHandler;

import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;


public class Main_httpClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
                PropertyHandler ph=new PropertyHandler();
                String fileName=ph.getDestinationJsonFile();
                String data=ph.getDataToSearch();
                
                
	            //String url = "http://54.235.133.136:9191/enhancer/chain/dbpedia-spotlight";
                String url =ph.getUrl();

                System.out.println(url);
		        try {
		            HttpClient client = new DefaultHttpClient();
		            HttpPost post = new HttpPost(url);
		            HttpResponse response = null;
		            //add credential to post request
		              //Credentials defaultcreds = new UsernamePasswordCredentials("admin", "admin");
		            Credentials defaultcreds = new UsernamePasswordCredentials(ph.getLoginName(), ph.getPassword());
		            post.addHeader( BasicScheme.authenticate(defaultcreds,"UTF8",false) );
		         
		            //send parmeters  
		            List <NameValuePair> parameters = new ArrayList <NameValuePair>();   
		           // parameters.add(new BasicNameValuePair("data", "iphone4"));   
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
			            
			            
			            
			            //Save in file
			        	JSONParser parser=new JSONParser();

						Object obj=parser.parse(br);
						JSONObject object=(JSONObject) obj;
						
						//System.out.println(object+"\n");
						
				        Set<?> keys = object.keySet();

//				        for(Object o : keys ){
//				          System.out.println(o + " : "+object.get(o));
//				        }

						JSONArray array1 = (JSONArray) object.get("@graph");
						//System.out.println(array1.size());
						for(int i=0;i<array1.size();i++)
						{
							JSONObject entity_refrence=(JSONObject) array1.get(i);
						//	System.out.println(entity_refrence.get("selected-text")+ " \n"+entity_refrence.get("type"));
							
							if(entity_refrence.get("selected-text") !=null){
							JSONObject obj2 = (JSONObject) entity_refrence.get("selected-text");
							
						//	System.out.println("..............  .//////// "+obj2.get("@value"));
							Object type = entity_refrence.get("type");
							if(type==null){
								type = "Others";
							}
							map.put(obj2.get("@value").toString(), type.toString());
							}
						}
						
						
						for(Entry<String,String> en : map.entrySet()){
							System.out.println(en.getKey() + " ........ "+en.getValue());
						}
						FileWriter file = new FileWriter(fileName);
						file.write(((JSONObject) obj).toJSONString());
						file.flush();
						
						br.close();
						
						System.out.println("!!! Data Saved in file : "+fileName);
			            // retrieve the output and display it in console
			        	/*String line;
			        	while ((line = br.readLine()) != null) {
			        		System.out.println(line);
			        	}
			           */
			        		
			        	
			        	stream.close();
		            }else
		            {
		            	System.out.println(" Unauthorized Access");
		            }
		            
		           
		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		    }
		
		
	}
