package Models;

public class Aluno
{
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMedia()
    {
        return (nota1 + nota2 + nota3 ) / 3.0;
    }

    public void verificarAprovacao()
    {
        if (calcularMedia() >= 7)
        {
            System.out.println("O Aluno está aprovado!");
        }
        else
        {
            System.out.println("O Aluno foi reprovado");
        }
    }
}