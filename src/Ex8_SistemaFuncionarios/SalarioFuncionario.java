package Ex8_SistemaFuncionarios;

public class SalarioFuncionario
{
    public static void main(String[] args)
    {
        Gerente gerente1 = new Gerente();
        Estagiario estagiario1 = new Estagiario();

        gerente1.nome = "Astolfo";
        estagiario1.nome = "Enzo";

        gerente1.salarioBase = 15000.0;
        estagiario1.salarioBase = 3000.0;

        System.out.println("O salario do gerente é de: " + gerente1.calcularSalario());
        System.out.println("O salario do estagiário é de: " + estagiario1.calcularSalario());
    }
}