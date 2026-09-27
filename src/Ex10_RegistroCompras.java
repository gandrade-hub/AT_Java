import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex10_RegistroCompras
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter("compras.txt")))
        {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Compra " + i);

                System.out.print("Digite o produto: ");
                String produto = sc.nextLine();

                System.out.print("Digite a quantidade: ");
                int quantidade = sc.nextInt();

                System.out.print("Digite o preço: ");
                double preco = sc.nextDouble();
                System.out.println();

                writer.println(produto + " - Qtd: " + quantidade + " - R$ " + preco);
                sc.nextLine();
            }
            System.out.println("Compras salvas com sucesso!");
        }
        catch (IOException e)
        {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
        System.out.println("Compras Registradas");
        try (Scanner leitor  = new Scanner(new File("compras.txt")))
        {
            while (leitor.hasNextLine())
            {
                String linha =leitor.nextLine();
                System.out.println(linha);
            }
        }
        catch (IOException e)
        {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}