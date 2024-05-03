import javax.swing.JOptionPane;

public class C11EX08 
{
    public static void main(String[] args) 
    {
       String nome, cargo, nomeMaiorSalario = "", cargoMaiorSalario = "";
       double horasTrabalhadas, valorPremio, valorHora, salario = 0, media = 0, maiorSalario = Double.MIN_VALUE, valorTotal = 0;
       int premio1 = 0, premio2 = 0, premio3 = 0, contador = 0;
       
       valorHora = Double.parseDouble(JOptionPane.showInputDialog(null,
       "Informe o valor da hora trabalhada da empresa: ",
       "Exercício 08",
       JOptionPane.QUESTION_MESSAGE));

        nome = JOptionPane.showInputDialog(null,
        "Informe o nome do funcionário: ",
        "Exercício 08",
        JOptionPane.QUESTION_MESSAGE);

        while (!nome.equalsIgnoreCase("fim")) 
        {
            contador++;

            cargo = JOptionPane.showInputDialog(null,
            "Informe o cargo do funcionário: ",
            "Exercício 08",
            JOptionPane.QUESTION_MESSAGE);

            horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe a quantidade de horas trabalhadas pelo funcionário: ",
            "Exercício 08",
            JOptionPane.QUESTION_MESSAGE));

            if (horasTrabalhadas <= 100)
            {
                valorPremio = 1000;
                premio1++;

            } else if (horasTrabalhadas <= 500)
            {
                valorPremio = horasTrabalhadas * 10;
                premio2++;

            } else
            {
                valorPremio = horasTrabalhadas / 10 * 100;
                premio3++;
            }

            salario = valorHora * horasTrabalhadas + valorPremio;
            media += horasTrabalhadas;
            valorTotal += salario;  
            
            if (salario > maiorSalario)
            {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
                cargoMaiorSalario = cargo;
            }

            System.out.printf("NOME DO FUNCIONÁRIO: %s\nCARGO: %s\nSALÁRIO : R$ %.2f\n", nome.toUpperCase(), cargo.toUpperCase(), salario);
            System.out.println();

            nome = JOptionPane.showInputDialog(null,
            "Informe o nome do funcionário: ",
            "Exercício 08",
            JOptionPane.QUESTION_MESSAGE);
        }

        media /= (double) contador;

        System.out.printf("MÉDIA DE HORAS TRABALHADAS POR PESSOA: %.2f\nNOME E CARGO DO FUCIONÁRIO COM MAIOR SALÁRIO: %s, %s\nQUANTIDADE DE FUNCIONÁRIOS QUE RECEBERAM O PRÊMIO 1: %d\nQUANTIDADE DE FUNCIONÁRIOS QUE RECEBERAM O PRÊMIO 2: %d\nQUANTIDADE DE FUNCIONÁRIOS QUE RECEBERAM O PRÊMIO 3: %d\nVALOR TOTAL DA FOLHA DE PAGAMENTO: R$ %.2f\n", media, nomeMaiorSalario.toUpperCase(), cargoMaiorSalario.toUpperCase(), premio1, premio2, premio3, valorTotal);
        System.out.println();

    }
}
