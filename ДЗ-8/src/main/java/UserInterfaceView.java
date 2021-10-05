import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private Controller controller = new Controller();

    public void runInterface() throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города (на английском языке): ");
            String city = scanner.nextLine();
            if (city.matches("[^A-Za-z]+")) {
                System.out.println("Неверное название города");
                continue;
            }

            System.out.println("Введите 1 для получения погоды на сегодня, 5 для прогноза на 5 дней," +
                    " 2 для получения данных из базы. Для выхода введите 0:");

            String command = scanner.nextLine();

            if (command.equals("0")) break;

            if (command.equals("1") || command.equals("5") || command.equals("2")) {
                controller.getWeather(command, city);
            } else {
                System.out.println("Неверная команда");
            }
        }
    }
}
