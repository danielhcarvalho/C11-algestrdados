import javax.swing.JOptionPane;

public class C11EX13 
{
    public static void main(String[] args) 
    {
        int termos, i = 0;
        double serie = 0;

        termos = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe quantos termos terá a série: ",
        "",
        JOptionPane.QUESTION_MESSAGE));

        do 
        {            
            if (termos >= i)
            {
            i++;
            serie += i * Math.pow(9 * i + 1, i * 2) / (Math.pow(7, i) / 7);
            }
        } while (termos >= i);

        serie = 71 + Math.cbrt(serie);
        System.out.println(serie);

            
    }
}
