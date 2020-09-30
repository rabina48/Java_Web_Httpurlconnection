package http.url;


import org.json.JSONArray;
import org.json.JSONObject;


import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AriesParser {


//    public  void get(String data) throws IOException {
//
//
//
//    }
    protected AriesInformation getAriesInformation(String data) {
        JSONObject object = new JSONObject(data);

        AriesInformation ariesInfo = new AriesInformation();
        ariesInfo.code = object.getInt("code");
        ariesInfo.success = object.getBoolean("success");
        ariesInfo.message = object.getString("message");



        JSONArray requiredArr = object.getJSONArray("data");
        AriesData ariesData = new AriesData();
        ariesData.id = requiredArr.getJSONObject(1).getInt("id");
        ariesData.name =requiredArr.getJSONObject(1).getString("name");
        ariesData.nameSw = requiredArr.getJSONObject(1).getString("nameSw");
       // ariesInfo.data = ariesData;

        List<AriesData> data1 = new ArrayList<>();
        for (int i = 0; i < requiredArr.length(); i++) {
//            System.out.println("===========================================");
//            System.out.println(" id = " + (requiredArr.getJSONObject(i)).getInt("id"));
//            System.out.println(" and  name = " + (requiredArr.getJSONObject(i)).get("name"));
//            System.out.println(" and  name = " + (requiredArr.getJSONObject(i)).get("nameSw"));
//            System.out.println("===========================================");
        }

       data1.add(ariesData);

        return ariesInfo;

    }

}



