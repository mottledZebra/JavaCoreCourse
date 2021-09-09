public class Main {
    public static void main(String[] args) {
        String[][] arr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма = " + sumArrayStringToInt(arr1));
        }
        catch (MyArraySizeException | MyArrayDataException  e) {
            System.out.println(e.getMessage());
        }

        String[][] arr2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        try {
            System.out.println("Сумма = " + sumArrayStringToInt(arr2));
        }
        catch (MyArraySizeException | MyArrayDataException  e) {
            System.out.println(e.getMessage());
        }

        String[][] arr3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма = " + sumArrayStringToInt(arr3));
        }
        catch (MyArraySizeException | MyArrayDataException  e) {
            System.out.println(e.getMessage());
        }

        String[][] arr4 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10a", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма = " + sumArrayStringToInt(arr4));
        }
        catch (MyArraySizeException | MyArrayDataException  e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArrayStringToInt(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int n;

        if (arr.length != 4) throw new MyArraySizeException("Размер массива не равен 4х4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Размер массива не равен 4х4");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    n = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент в строке " + (i + 1) + " столбце " + (j + 1) + " не содержит число");
                }
                sum += n;
            }
        }

        return sum;
    }
}
