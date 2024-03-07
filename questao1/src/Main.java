import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt(); //Tamanho do vetor

        int[] numeros = new int[tamanho];

        //O "for" abaixo atribui valores a cada posição do vetor
        for(int i = 0; i < numeros.length; i++)
        {
            System.out.print(i+1 + "º valor: ");
            numeros[i] = scanner.nextInt();
        }

        //Imprimir somente os valores pares do vetor
        System.out.println("\nValores pares do vetor: ");
        int teste = 0; //Para saber se há número par

        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i]%2 == 0) {
                System.out.print(numeros[i] + " ");
                teste = 1; //Caso houver número par, recebe 1, do contrário, variável continua com zero
            }
        }

        if(teste == 0)
            System.out.println("Não há número par no vetor");

    }
}