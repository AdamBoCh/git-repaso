import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = scanner.nextInt();
        for (int i = 0;i < n;i++){
            System.out.println("numeros anteriores " + i);
        if (i == 5){
            System.out.println("Es el numero bueno: " + i * 5);
        }
        }
    }
}