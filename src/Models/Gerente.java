package Models;

public class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
}