import app.Test;
import app.app.TestImpl;

public class App {
    public static void main(String[] args) {
        Test test = new TestImpl();
        System.out.println(test.getText());
    }
}
