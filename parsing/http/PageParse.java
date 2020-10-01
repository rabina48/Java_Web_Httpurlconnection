package parsing.http;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PageParse {

    protected   MyData getParser(String dat){


        JSONArray myDataObj = new JSONArray(dat);
        MyData myData = new MyData();
        List<MyData> arrayData = new ArrayList<>();

        myData.postId = myDataObj.getJSONObject(1).getInt("postId");
        myData.id = myDataObj.getJSONObject(1).getInt("id");
        myData.name = myDataObj.getJSONObject(1).getString("name");
        myData.email= myDataObj.getJSONObject(1).getString("email");
        myData.body= myDataObj.getJSONObject(1).getString("body");

        for (int i = 0; i < myDataObj.length(); i++){
            System.out.println("The PostId is => "+(myDataObj.getJSONObject(i).getInt("id")));
            System.out.println("The id is => "+(myDataObj.getJSONObject(i).getInt("id")));

            System.out.println("The name is => "+(myDataObj.getJSONObject(i).getString("name")));
            System.out.println("The email is => "+(myDataObj.getJSONObject(i).getString("email")));
            System.out.println("The body is => "+(myDataObj.getJSONObject(i).getString("body")));
            System.out.println("-----------------------------------------------------------------------");

        }
          arrayData.add(myData);

        return myData;
    }
}
