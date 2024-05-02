import java.util.Scanner;

public class C11EX03
{
    public static void main(String[] args) 
    {
        String placa;
        int dia, pontos, pontos8 = 0;
        double valorMulta, total = 0;

        
        Scanner multas = new Scanner(C11EX03.class.getResourceAsStream("C11EX03.txt"));

        dia = multas.nextInt();
        multas.nextLine();

        while (dia != 99)
        {
  
            placa = multas.nextLine();
            pontos = multas.nextInt();

            if (pontos == 3) 
            {
                valorMulta = 42;

            } else if (pontos == 5) 
            {
             valorMulta = 108;
            } else
            {
                valorMulta = 479;
            }

            if (pontos == 8 && dia <= 15) 
            {
                pontos8++;
            }

            total += valorMulta;

            System.out.printf("DIA DA MULTA: %d\nPLACA DO VEÍCULO MULTADO: %s\nQUANTIDADE DE PONTOS NA CARTEIRA: %d\nVALOR DA MULTA: R$ %.2f\n", dia, placa.toUpperCase(), pontos, valorMulta);
            System.out.println();
            dia = multas.nextInt();
            multas.nextLine();
        }

        System.out.printf("TOTAL DE MULTAS COM 8 PONTOS: %d\nVALOR TOTAL: R$ %.2f", pontos8, total);
        multas.close();
    }
}
