import java.util.Scanner;
public class Main {
    static boolean palindromo(String palavra, int pripos, int ultpos)
    {
        while(pripos != ultpos)
        {
            if(palavra.charAt(pripos) == ' ' && palavra.charAt(ultpos) != ' ')
            {
                pripos++;
            }
            else if(palavra.charAt(pripos) != ' ' && palavra.charAt(ultpos) == ' ')
            {
                ultpos--;
            }
            else if(palavra.charAt(pripos) == ' ' && palavra.charAt(ultpos) == ' ')
            {
                pripos++;
                ultpos--;
            }
            else
            {
                if(palavra.charAt(pripos) != palavra.charAt(ultpos))
                {
                    return true;
                }
                pripos++;
                ultpos--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        palavra = palavra.toUpperCase();

        int ultpos = palavra.length();
        ultpos -= 1; //Última posição

        int pripos = 0; //Primeira posição


        //A função palindromo retorna true se não palíndromo e false se for
        if(palindromo(palavra, pripos, ultpos))
        {
            System.out.println("Não é palíndromo!");
        }
        else
        {
            System.out.println("É palíndromo!");
        }

        scanner.close();
    }
}