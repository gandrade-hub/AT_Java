import java.util.Scanner;

public class ValidaSenha
{
    static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;
        String senha = ""; // evita nullpointerexception

        while (!temMaiuscula || !temNumero || !temEspecial || senha.length() < 8)
        {
            System.out.print("Digite uma senha:  ");
            senha = sc.nextLine();

            temMaiuscula = false;
            temNumero = false;
            temEspecial = false;

            if (senha.length() < 8)
            {
                System.out.println("Sua senha deve conter no mínimo 8 caracteres.");
            }

            for (int i = 0; i < senha.length(); i++)
            {
                char c = senha.charAt(i);
                if (Character.isUpperCase(c)) {
                    temMaiuscula = true;
                }
                if (Character.isDigit(c)) {
                    temNumero = true;
                }
                if (!Character.isLetterOrDigit(c))
                {
                    temEspecial = true;
                }
            }

            if (!temMaiuscula)
            {
                System.out.println("Erro: a senha precisa ter pelo menos uma letra Maiúscula.");
            }
            if (!temNumero)
            {
                System.out.println("Erro: a senha precisa ter pelo menos um número.");
            }
            if (!temEspecial)
            {
                System.out.println("Erro: a senha precisa ter pelo menos um caracter esoecial.");
            }
        }
        System.out.println("Senha cadastrada com sucesso!");
    }
}