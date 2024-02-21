package labs.lab_6;

public class Lab_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";

        if (url.indexOf("https")!=-1) {
            System.out.println("https");
            System.out.println("Domain name: " + url.substring(8,url.lastIndexOf(".")));
        }
        else if (url.indexOf("http")!=-1 && url.indexOf("https")==-1) {
            System.out.println("http");
            System.out.println("Domain name: " + url.substring(7,url.lastIndexOf(".")));
        }
        else {
            System.out.println("No valid method in url");
            System.out.println("Domain name: " + url.substring(0,url.lastIndexOf(".")));
        }

        if (url.indexOf(".net")!=-1)
            System.out.println(".net");
        if (url.indexOf(".com")!=-1)
            System.out.println(".com");

    }
}
