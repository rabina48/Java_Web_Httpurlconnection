package http.url;



import java.io.IOException;
import java.net.HttpURLConnection;

public class Main {

    public  static  void main (String [] args) throws IOException {

        WebpageRead webpageRead = new WebpageRead();
       String data = webpageRead.getWebPages();

        AriesParser aI = new AriesParser();
      //  aI.get();


    }
}
