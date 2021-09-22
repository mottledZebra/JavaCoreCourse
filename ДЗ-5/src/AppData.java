import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String getAllAsCSV() {
        String str = "";

        for (int i = 0; i < header.length - 1; i++) {
            str += header[i] + ";";
        }
        str += header[header.length - 1] += "\r\n";

        for (int[] column : data) {
            for (int i = 0; i < column.length - 1; i++) {
                str += column[i] + ";";
            }
            str += column[column.length - 1] + "\r\n";
        }

        return str;
    }

    @Override
    public String toString() {
        String str = "";

        for (String column : header) {
            str += column + "\t";
        }
        str += "\n";

        for (int[] row : data) {
            for (int cell : row) {
                str += cell + "\t";
            }
            str += "\n";
        }

        return  str;
    }
}
