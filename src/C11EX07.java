import javax.swing.JOptionPane;

public class C11EX07 {
    public static void main(String[] args) 
    {
        double temperatura, maiorTemperatura = Double.MIN_VALUE, menorTemperatura = Double.MAX_VALUE, media = 0, diasMuitoQuentes = 0, dia;

        for (dia = 1; dia <= 121; dia++) {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe a temperatura do dia " + (int) dia,
                    "Exercício 07",
                    JOptionPane.QUESTION_MESSAGE));

            media += temperatura;

            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Informe a temperatura do dia " + (int) dia,
                    "Exercício 07",
                    JOptionPane.QUESTION_MESSAGE));

            if (dia == 1 || temperatura > maiorTemperatura) 
            {
                maiorTemperatura = temperatura;
            }

            if (dia == 1 || temperatura < menorTemperatura) 
            {
                menorTemperatura = temperatura;
            }

            System.out.printf("%.2f %.2f %.2f ");
        }
    }

}
