package parsing.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class PageReader {
    StringBuffer responseContent;
    String readLine, line;
    String data = " ";

    public String getData() throws IOException {
        URL url = new URL(PageSource.urlPath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");


        int responseMsg = connection.getResponseCode();
        if(responseMsg > 299 ){
            BufferedReader errorRead = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

            while ((line = errorRead.readLine()) != null){
               StringBuffer message =responseContent.append(line);
            }
            //System.out.println("The response msg is = "+StringBuffer.message);
            errorRead.close();
        }else{

            try{
                InputStream reader = connection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(reader));
                readLine = bufferedReader.readLine();

                while (readLine != null){
                    data = data + readLine;
                    System.out.println(readLine);
                    readLine = bufferedReader.readLine();
                }
                 System.out.println(readLine);

            }catch (MalformedURLException e){
                e.printStackTrace();
            }
        }
return  data;
    }
}
