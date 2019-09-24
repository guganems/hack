import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Guga\\Desktop\\hack\\cyber-lab\\loganalysis\\amadeus\\iaccess.log"))) {
            String line;
            ArrayList<String> ips = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String ip = getIP(line);
                if (!ips.contains(ip)) {
                    ips.add(ip);
                }
            }
            for (String str : ips) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getIP(String line) {
        int iend = line.indexOf("-");
        String subString = "";
        if (iend != -1)
        {
            subString= line.substring(0 , iend); //this will give abc
        }
        return subString;
    }
}
