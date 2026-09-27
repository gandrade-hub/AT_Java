import Models.Veiculo;

public class CadastroVeiculo
{
    public static void main(String[] args)
    {
        Veiculo carro1 = new Veiculo();
        Veiculo carro2 = new Veiculo();

        carro1.placa = "ABC1D23";
        carro1.modelo = "Fiat 500";
        carro1.anoFabricacao = 2013;
        carro1.quilometragem = 96000.0;

        carro1.registrarViagem(420.9);
        carro1.exibirDetalhes();

        carro2.placa = "EFG2H34";
        carro2.modelo = "Volvo XC40";
        carro2.anoFabricacao = 2025;
        carro2.quilometragem = 1000.0;

        carro2.registrarViagem(360.0);
        carro2.exibirDetalhes();
    }
}