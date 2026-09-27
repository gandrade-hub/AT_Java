import Models.ContaBancaria;

public class Ex9_ContaBancariaEncapsulada
{
    public static void main(String[] args)
    {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Gabriel";
        conta1.depositar(500);
        conta1.exibirSaldo();
        conta1.sacar(200);
        conta1.sacar(1000);
        conta1.exibirSaldo();
    }
}