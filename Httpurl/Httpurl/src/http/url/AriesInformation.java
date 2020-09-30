package http.url;

import org.json.JSONArray;

import javax.xml.crypto.Data;
import java.util.List;

public class AriesInformation {
    public int code;
    public boolean success;
    public String message;
    public  List<AriesData> data;

    AriesInformation(){

    }
    public AriesInformation(int code, boolean success, String message, List<AriesData> data) {
        this.code = code;
        this.success = success;
        this.message = message;
         this.data = data;
    }


}
