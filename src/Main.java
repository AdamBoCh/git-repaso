import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = scanner.nextInt();
        for (int i = 0;i < n;i++){
            System.out.println("nuemros anteriores" + i);
        }
    }
}