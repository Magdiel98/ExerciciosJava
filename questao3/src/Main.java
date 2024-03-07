import java.util.Scanner;
public class Main {
    static boolean buscaPalavra(String frase, String palavra)
    {
        int cont = 0; //Para percorrer palavra
        frase = frase.toLowerCase(); //Deixar tudo minúsculo para facilitar o processo de busca
        palavra = palavra.toLowerCase();

        for(int i = 0; i < frase.length(); i++)
        {
            if(frase.charAt(i) == palavra.charAt(cont))
            {
                cont++;
                if(cont == palavra.length())
                {
                    return true;
                }
            }
            else
            {
                cont = 0;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "Olá mundo!";
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine();

        while (!(palavra.equals("sair"))) {

            if(buscaPalavra(frase, palavra))
            {
                System.out.println("Palavra encontrada");
            }
            else
            {
                System.out.println("Palavra não encontrada");
            }
            System.out.println("Digite uma palavra: ");
            palavra = scanner.nextLine();
        }
    }
}