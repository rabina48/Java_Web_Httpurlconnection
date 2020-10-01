package parsing.http;

public class MyData {
    public int postId;
    public int id;
    public String name;
    public String email;
    public String body;

    MyData(){

    }

    public MyData(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
