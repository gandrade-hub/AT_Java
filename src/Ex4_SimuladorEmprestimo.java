import java.util.Scanner;

public class Ex4_SimuladorEmprestimo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = sc.nextLine();

        System.out.print("Qual o valor do emprestimo? ");
        double emprestimo = sc.nextDouble();

        System.out.print("Em quantas parcelas deseja pagar (6-48)? ");
        int parcelas = sc.nextInt();

        while (parcelas > 48 || parcelas < 6)
        {
            System.out.println("Número de parcelas inválidas");
            System.out.println("Digite novamente o número de parcelas desejadas: ");
            parcelas = sc.nextInt();
        }

        double valorTotal = emprestimo * (1 + 0.03 * parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("O valor total pago será de: R$ "+valorTotal);
        System.out.printf("O valor da parcela mensal será: RS %.2f", valorParcela);
    }
}