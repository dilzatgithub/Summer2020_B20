package day51_Exceptions.BrowsersTask;

public class ChromeBrowser extends webDriver {
    public void get(String url){
        System.out.println("opening the "+ url+" in chrome browser");
    }
    public void close(){
        System.out.println("closing the chrome browser");
    }

}
