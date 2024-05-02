import javax.swing.JOptionPane;

public class C11EX07 
{
    public static void main(String[] args) 
    {
        double temperatura, maiorTemperatura = Double.MIN_VALUE, menorTemperatura = Double.MAX_VALUE, media = 0, diasMuitoQuentes = 0, dia;
    
        for (dia = 1; dia <= 121; dia++)
        {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe a temperatura do dia " + (int) dia,
            "Exercício 07",
            JOptionPane.QUESTION_MESSAGE));

            while (temperatura < 485)
            {
                media += temperatura;
                System.out.println("batata");

                temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe a temperatura do dia " + (int) dia,
                "Exercício 07",
                JOptionPane.QUESTION_MESSAGE));

                if (temperatura >= 485) 
                {
                    System.out.println("CÓDIGO FINALIZADO!");
                    break;
                    
                } else if (temperatura > maiorTemperatura) 
                {awdjasdQAdoçpasC ASF WfasDAS.DNaNMDLÇA
                }

                System.out.printf("%.2f %.2f %.2f ");
            }
        }

    }


}
