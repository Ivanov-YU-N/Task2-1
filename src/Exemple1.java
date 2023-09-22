import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class Exemple1 {
    public static void main(String[] args) {
        float number = getNumber();
    }
    public static float getNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        float number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!validInput) {
            System.out.println("Введите дробное число  ");
            try {
                number = Float.parseFloat(reader.readLine());
                validInput = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Ошибка ввода. Попробуй еще раз ");
            }
        }
            return number;
        }
}


