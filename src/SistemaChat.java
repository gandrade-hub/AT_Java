import java.util.Scanner;

public class SistemaChat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] mensagens = new String[10];

        System.out.print("Digite o nome do primeiro usuário: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String nome2 = sc.nextLine();
        System.out.println();

        for (int i = 0; i < 10; i++)
        {
            String usuario;

            if (i % 2 == 0)
            {
                usuario = nome1;
            }
            else
            {
                usuario = nome2;
            }
            System.out.print(usuario + ", digite sua mensagem: ");
            String texto = sc.nextLine();

            mensagens[i] = usuario + ": " + texto;
            System.out.println();
        }
        System.out.println();
        System.out.println("==== Histórico de Mensagens ====");
        for (String msg: mensagens)
        {
            System.out.println(msg);
            System.out.println();
        }
        System.out.println();
        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}
