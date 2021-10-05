import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        UserInterfaceView userInterfaceView = new UserInterfaceView();

        try {
            userInterfaceView.runInterface();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
