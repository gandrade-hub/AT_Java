package Models;

public class ContaBancaria {
    public String titular;
    private double saldo;

    public void depositar(double valor)
    {
        saldo += valor;
    }
    public void sacar(double valor)
    {
        if (saldo >= valor)
        {
            saldo -= valor;
        }
        else System.out.println("Saldo Insuficiente");
    }
    public void exibirSaldo()
    {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }
}