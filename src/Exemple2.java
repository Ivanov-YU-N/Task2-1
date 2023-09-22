public class Exemple2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1,2,3,4,56,9,8,7,6};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            System.out.println("На ноль делить нельзя");
        }
    }
}
