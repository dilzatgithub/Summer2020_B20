package day51_Exceptions.BrowsersTask;

public class webDriver {
    public void get(String url){
        System.out.println("opening the "+ url+" in default browser");
    }
    public void close(){
        System.out.println("closing the default browser");
    }
}
