import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File fileCsv = new File("/home/sonnguyen/CodegymModule2/readFile-.csv/source/country.csv");
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileCsv));
            String line = "null";

            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] temp = (line.split(","));
                System.out.print((i + 1) + "." + temp[4].replaceAll("\"", "") + " " + temp[5].replaceAll("\"", ""));
                System.out.println();
                i++;
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
