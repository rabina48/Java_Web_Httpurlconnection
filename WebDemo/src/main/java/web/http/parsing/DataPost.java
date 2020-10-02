package web.http.parsing;

public class DataPost {
    public int id;
    public String title;

    protected  DataPost(){

    }
    public DataPost(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
