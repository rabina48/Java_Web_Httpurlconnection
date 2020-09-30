package http.url;

import javax.xml.crypto.Data;
import java.util.List;

public class AriesInformation {
    public int code;
    public boolean success;
    public String message;
    public List<Data> data;

    public AriesInformation(int code, boolean success, String message, List<Data> data) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
