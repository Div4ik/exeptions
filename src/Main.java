import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                System.out.println(a/b);

            } catch (Exception e) {
                throw new WrongNumberException("На ноль делить нельзя");

            }

        }
    }
}