import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World !";

        ArrayList<String> listString = new ArrayList<String>(Arrays.asList(text.split(" ")));

        System.out.println(listString);
    }
}
