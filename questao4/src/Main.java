import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade em segundos: ");
        int segundos = scanner.nextInt();

        int hor, min, seg, resto;

        hor = segundos /3600;
        resto = segundos % 3600;
        min = resto / 60;
        seg = resto % 60;

        String resultado = String.format("%02d:%02d:%02d", hor, min, seg);

        System.out.println(resultado);

    }
}