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


    public  void get() {
        JSONObject object = new JSONObject();
        JSONArray jsonArray = new JSONArray("data");
    }


    protected AriesInformation getAriesInformation(JSONObject object) {

        AriesInformation ariesInfo = new AriesInformation();
        ariesInfo.code = object.getInt("code");
        ariesInfo.success = object.getBoolean("success");
        ariesInfo.message = object.getString("message");
        ariesInfo.data =  getAriesData(jsonArray);

        return ariesInfo;

    }

    protected AriesData getAriesData(JSONArray jsonArray) {


        JSONObject ob = new JSONObject();
        AriesData ariesData = new AriesData();
        ariesData.id = ob.getInt("id");
        ariesData.name =ob.getString("name");
        ariesData.nameSw = ob.getString("nameSw");

        List<Data> data = new ArrayList<>();
       for(int i = 0; i< jsonArray.length(); i++){
           String arrayValue = jsonArray.getString(i);
           data.add(arrayValue);
       }


        return ariesData;

    }

}



