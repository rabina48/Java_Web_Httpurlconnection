package parsing.http;

import http.url.DisplayOutput;

import java.io.IOException;

public class Main {
    public static  void main( String[] args) throws IOException {

        PageReader pageReader = new PageReader();
       String dat = pageReader.getData();

       PageParse pageParse = new PageParse();
        MyData parsedData = pageParse.getParser(dat);

        PageOutput dp = new PageOutput();
        dp.display(parsedData);


    }
}
