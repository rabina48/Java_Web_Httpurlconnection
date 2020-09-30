package http.url;

public class DisplayOutput {

    public void showData(AriesInformation ariesInfo){
        System.out.println("code  = "+ariesInfo.code);
        System.out.println("succes  = "+ariesInfo.success);
        System.out.println("message  = "+ariesInfo.message);


          System.out.println("===========================================");
          System.out.println(" id = " + ariesInfo.data.get(0).id+ " & the name = "+ariesInfo.data.get(0).name+ " & nameSw = "+ariesInfo.data.get(0).nameSw);


    }
}
