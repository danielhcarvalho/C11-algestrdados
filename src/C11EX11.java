import javax.swing.JOptionPane;

public class C11EX11 
{
    public static void main(String[] args) 
    {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe o número de repetições:",
        "",
        JOptionPane.QUESTION_MESSAGE));

        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }
            for (int j = i; j > 0; j--) 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
