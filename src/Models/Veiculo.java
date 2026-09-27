package Models;

public class Veiculo
{
        public String placa;
        public String modelo;
        public int anoFabricacao;
        public double quilometragem;

        public void exibirDetalhes()
        {
            System.out.printf("Veículo: %s, %s, %d, %.2f", placa,modelo,anoFabricacao,quilometragem);
            System.out.println();
        }

        public double registrarViagem(double km)
        {
            quilometragem += km;
            return quilometragem;
        }
}