import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void save(AppData data, String string) {
        byte[] outData = data.getAllAsCSV().getBytes();
        try (FileOutputStream out = new FileOutputStream(string)) {
            out.write(outData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData get(String string) {
        String[] header = null;
        ArrayList<int[]> tmpData = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(string))) {
            header = reader.readLine().split(";");

            String tmpString;
            while ((tmpString = reader.readLine()) != null) {
                String[] tmpStrArr = tmpString.split(";");
                int[] tmpDataArr = new int[tmpStrArr.length];
                for (int i = 0; i < tmpDataArr.length; i++) {
                    tmpDataArr[i] = Integer.parseInt(tmpStrArr[i]);
                }
                tmpData.add(tmpDataArr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] data = new int[tmpData.size()][];
        for (int i = 0; i < tmpData.size(); i++) {
            data[i] = tmpData.get(i);
        }
        return new AppData(header, data);
    }

    public static void main(String[] args) {
        String fileName = "appdata.csv";

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        AppData appDataOut = new AppData(header, data);

        save(appDataOut, fileName);

        AppData appDataIn = get(fileName);
        System.out.println(appDataIn);
    }
}
