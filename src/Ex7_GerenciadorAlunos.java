import Models.Aluno;

import java.util.Scanner;

public class Ex7_GerenciadorAlunos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.print("Qual o seu nome? ");
        aluno1.nome = sc.nextLine();

        System.out.print("Qual a sua primeira nota? ");
        aluno1.nota1 = sc.nextDouble();

        System.out.print("Qual a sua segunda nota? ");
        aluno1.nota2 = sc.nextDouble();

        System.out.print("Qual a sua terceira nota? ");
        aluno1.nota3 = sc.nextDouble();


        aluno1.calcularMedia();
        System.out.printf("Média do aluno: %.2f%n", aluno1.calcularMedia());
        aluno1.verificarAprovacao();

    }
}