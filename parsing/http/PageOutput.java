package parsing.http;

public class PageOutput {

    public  void display(MyData myData){
        System.out.println("The PostId is => "+myData.postId);
        System.out.println("The id is => "+myData.id);
        System.out.println("The name is => "+myData.name);
        System.out.println("The email is => "+myData.email);
        System.out.println("The body is => "+myData.body);



    }
}
