package Models;

public class Estagiario extends Funcionario
{
    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}