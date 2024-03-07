import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTier 1 - Jogar online \nTier 2 - Catálogo de jogos \nTier 3 - Catálogo de jogos clássicos e game trials\nEscolha o Tier: ");
        int tier = scanner.nextInt();

        String opcao[] = {"- Permissão para jogar online", "- Acesso ao catálogo de jogos", "- Acesso ao catálogo de jogos clássicos e game trials"};

        switch(tier)
        {
            case 3:
                System.out.println(opcao[2]);
            case 2:
                System.out.println(opcao[1]);
            case 1:
                System.out.println(opcao[0]);
                break;
        }

    }
}