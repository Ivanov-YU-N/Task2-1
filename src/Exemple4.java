import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemple4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст кроме пустой строки");
        try {
            String res = reader.readLine();
            if(res.equals("")) throw new RuntimeException("Пустую строку вводить нельзя");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}