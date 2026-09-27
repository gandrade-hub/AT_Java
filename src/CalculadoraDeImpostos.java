import java.util.Scanner;
public class CalculadoraDeImpostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual seu salario bruto mensal? ");
        double salarioBrutoMensal = sc.nextDouble();
        double impostoRenda = 0;
        double salarioBrutoAnual = salarioBrutoMensal * 12.0;

        if (salarioBrutoAnual > 45012.60) {
            impostoRenda  = salarioBrutoAnual * 0.275;
        }
        else if (salarioBrutoAnual > 33919.80) {
            impostoRenda = salarioBrutoAnual * 0.15;
        }
        else if (salarioBrutoAnual > 22847.76 ) {
            impostoRenda = salarioBrutoAnual * 0.075;
        }
        else
        {
            impostoRenda = 0;
        }

        double salarioLiquido = salarioBrutoAnual - impostoRenda;
        System.out.println("O salario liquido anual é de: " + salarioLiquido);
        System.out.println("O imposto total pago foi de: " + impostoRenda);
    }
}