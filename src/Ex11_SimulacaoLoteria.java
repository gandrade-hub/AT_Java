import java.util.Random;
import java.util.Scanner;

public class Ex11_SimulacaoLoteria {
    public static void main (String[] args)
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] sorteados = new int[6];
        int[] aposta = new int[6];

        for (int i = 0; i < 6; i++)
        {
            sorteados[i] = random.nextInt(1,61);
        }

        for (int i = 0; i < 6; i++)
        {
            System.out.print("Digite seu palpite: ");
            aposta[i] = sc.nextInt();
        }

        int acertos = 0;

        for(int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (aposta[i] == sorteados[j])
                {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("Resultados:");
        System.out.println("Números sorteados: ");
        for (int num : sorteados)
        {
            System.out.print(num + " ");
        }

        System.out.println("Você teve " + acertos + " acerto(s)");

        sc.close();
    }
}