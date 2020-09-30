package http.url;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebpageRead {
    String line;
    StringBuffer reponseContent;
    String data = "";


    public String getWebPages() throws IOException {
        URL url = new URL(webPageSource.urlPath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int response = connection.getResponseCode();
        if (response > 299){
          BufferedReader  errorReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

          while((line = errorReader.readLine()) != null){
              reponseContent.append(line);
          }
          System.out.println(connection.getResponseMessage());
          System.out.println();
          errorReader.close();
        }else {

            try {
                InputStream reader = connection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(reader));
                String readLine = bufferedReader.readLine();


                while (readLine != null) {

                    data = data + readLine;
                    System.out.println(readLine);
                    readLine = bufferedReader.readLine();
                }
                System.out.println(data);


            } catch (MalformedURLException e) {
                e.printStackTrace();

            }

        }

        return data;
    }
}
