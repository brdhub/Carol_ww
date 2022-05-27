import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class carol {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.bilibili.com/x/v2/reply?jsonp=jsonp&pn=1&type=17&oid=662016827293958168&sort=2");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        BufferedReader in = new BufferedReader(new InputStreamReader(huc.getInputStream()));
        String info = in.readLine();
        BufferedWriter out = new BufferedWriter(new FileWriter("info.json"));
        out.write(info);
        in.close();
        out.close();
        
    }
}
