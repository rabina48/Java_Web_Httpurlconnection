package web.http.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class PostDataRead {
    String path = "https://my-json-server.typicode.com/typicode/demo/db";
    String reader, line, data ="";
    StringBuffer readContent;

    protected void getDataRead() throws IOException {
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int response = connection.getResponseCode();
        if(response > 299){
            BufferedReader errorRead = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            while ((line = errorRead.readLine()) != null){
                StringBuffer message = readContent.append(line);
            }
            errorRead.close();

        }else {
            try{
                InputStream in  = connection.getInputStream();
               BufferedReader dataReader = new BufferedReader(new InputStreamReader(in));
               reader = dataReader.readLine();
               while(reader != null){

                   reader = dataReader.readLine();
                  data = data + reader;
               }
               System.out.println(data);

            }catch (MalformedURLException e){
                System.out.println("Url not found => ERROR!!");
            }
        }


    }
}
