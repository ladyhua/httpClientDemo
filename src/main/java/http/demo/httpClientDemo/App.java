package http.demo.httpClientDemo;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;


public class App 
{
    public static void main( String[] args ) throws HttpException, IOException
    {
    	HttpClient client = new HttpClient();

        HttpMethod method = new GetMethod("http://localhost:8080/springmvcdemo/order/selectAllOrder");   

        client.executeMethod(method);   

        System.out.println(method.getStatusLine());   


        System.out.println(method.getResponseBodyAsString());   

        //释放连接   

        method.releaseConnection();   
    }
}
