import javax.swing.JOptionPane;

public class C11EX07 
{
    public static void main(String[] args) 
    {
        double temperatura, menorTemperatura = Double.MAX_VALUE, maiorTemperatura = Double.MIN_VALUE, media = 0;
        int repMaiorTemp = 0, i;

        for (i = 1; i <= 121; i++) 
        {
            temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Informe a temperatura do dia " + i,
            "Exercício 07",
            JOptionPane.QUESTION_MESSAGE));

            media += temperatura;

            if (i == 1 || temperatura < menorTemperatura)
            {
                menorTemperatura = temperatura;
            }
            if (i == 1 || temperatura > maiorTemperatura) 
            {
                maiorTemperatura = temperatura;
                repMaiorTemp = 1;

            } else if (temperatura == maiorTemperatura) 
            {
                repMaiorTemp++;
            }
        }
        media /= (i - 1);

        System.out.printf("A MENOR TEMPERATURA FOI %.1f °C\nA MAIOR TEMPERATURA FOI %.1f °C\nA MÉDIA DAS TEMPERATURA ENTRE JANEIRO E ABRIL FOI DE %.1f °C\nA MAIOR TEMPERATURA (%.1f °C) ocorreu %d dias", menorTemperatura, maiorTemperatura, media, maiorTemperatura, repMaiorTemp);
        System.out.println();

    }


}
