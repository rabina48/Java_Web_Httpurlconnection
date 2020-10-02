package web.http.parsing;

public class DataComment {
    public int id;
    public String body;
    public int postId;


    protected DataComment(){

    }

    public DataComment(int id, String body, int postId) {
        this.id = id;
        this.body = body;
        this.postId = postId;
    }
}
