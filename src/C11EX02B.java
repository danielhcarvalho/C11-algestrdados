import javax.swing.*;

public class C11EX02B
{
    public static void main(String[] args)
    {
        String nome = "", classificacao, nomeMenorAplicacao = "";
        int clientesBronze = 0, clientesPrata = 0, clientesOuro = 0;
        double aplicado, mediaBronze, totalBronze = 0, total = 0, menorAplicacao = Double.MAX_VALUE;

        do
        {
            nome = JOptionPane.showInputDialog(null,
                    "Informe o nome do cliente:",
                    "Exercício 02b",
                    JOptionPane.QUESTION_MESSAGE);
            aplicado = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe o valor aplicado pelo cliente:",
                    "Exercício 02b",
                    JOptionPane.QUESTION_MESSAGE));
            total += aplicado;

            if (aplicado <= 1000)
            {
                classificacao = "BRONZE";
                clientesBronze++;
                totalBronze += aplicado;

            } else if (aplicado <= 5000)
            {
                classificacao = "PRATA";
                clientesPrata++;

            } else
            {
                classificacao = "OURO";
                clientesOuro++;
            }

            if (aplicado < menorAplicacao)
            {
                menorAplicacao = aplicado;
                nomeMenorAplicacao = nome;
            }

            System.out.printf("NOME DO CLIENTE: %s\nVALOR APLICADO PELO CLIENTE: R$ %.2f\nCLASSIFICAÇÃO: %s\n", nome.toUpperCase(), aplicado, classificacao);
            System.out.println();

        } while (!nome.equalsIgnoreCase("reynaldo duarte"));
        
        mediaBronze = totalBronze / clientesBronze;
        System.out.printf("BRONZE: %d clientes\nPRATA: %d clientes\nOURO: %d clientes\n", clientesBronze, clientesPrata, clientesOuro);
        System.out.println();
        System.out.printf("MÉDIA DOS VALORES APLICADOS POR CLIENTES BRONZE: R$ %.2f\nVOLUME TOTAL DE APLICAÇÕES: R$ %.2f\nCLIENTE COM A MENOR APLICAÇÃO: %s", mediaBronze, total, nomeMenorAplicacao.toUpperCase());
    }
}

