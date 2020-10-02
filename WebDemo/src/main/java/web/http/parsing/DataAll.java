package web.http.parsing;

import java.util.List;

public class DataAll {

    public List<DataAll> posts;
    public List<DataComment> comments;
    public DataProfile profile;

    protected DataAll() {

    }
    public DataAll(List<DataAll> posts, List<DataComment> comments, DataProfile profile) {
        this.posts = posts;
        this.comments = comments;
        this.profile = profile;
    }
}

