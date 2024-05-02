
import javax.swing.JOptionPane;

public class C11EX06 
{
    public static void main(String[] args)
    {
        int canal, qntPessoas, audienciaCanal4 = 0, audienciaCanal7 = 0, audienciaCanal12 = 0, canalMaisAssistido = 0, total = 0, casasContabilizadas = 0; 
        Object[]  canalOpcoes = {"4", "7", "12", "0"}; 
        double porcentagemCanal4, porcentagemCanal7, porcentagemCanal12, media = 0;



        for (int i = 1; i <= 3; i++) 
        {
            canal = JOptionPane.showOptionDialog(null, 
            "Informe o canal que estava sendo assistido na casa:", 
            "Exercício 06", 
            0, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            canalOpcoes, 
            "4");

            if (!canalOpcoes[canal].equals("0")) 
            {
                qntPessoas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe a quantidade de pessoas assistindo ao canal " + canalOpcoes[canal] + " na casa " + i + ": ",
                "Exercício 06",
                JOptionPane.QUESTION_MESSAGE));

                casasContabilizadas++;
                total += qntPessoas;
                media += qntPessoas;

                if (canalOpcoes[canal].equals("4"))
                {
                    audienciaCanal4 += qntPessoas;

                } else if (canalOpcoes[canal].equals("7")) 
                {
                    audienciaCanal7 += qntPessoas;    
                } else if (canalOpcoes[canal].equals("12")) 
                {
                    audienciaCanal12 += qntPessoas;
                }

            } else
            {
                System.out.println("CASA ANULADA!\n");
            }
        }
        porcentagemCanal4 = (double) audienciaCanal4 / total * 100;
        porcentagemCanal7 = (double) audienciaCanal7 / total * 100;
        porcentagemCanal12 = (double) audienciaCanal12 / total * 100;
        canalMaisAssistido = Math.max(audienciaCanal4, Math.max(audienciaCanal7, audienciaCanal12));
        media /= casasContabilizadas;

        if (canalMaisAssistido == audienciaCanal4)
        {
            canalMaisAssistido = Integer.valueOf("4");
        } else if (canalMaisAssistido == audienciaCanal7)
        {
            canalMaisAssistido = Integer.valueOf("7");
        } else
        {
            canalMaisAssistido = Integer.valueOf("12");
        }

        System.out.printf("AUDIÊNCIA TOTAL CANAL 4: %d\nPORCENTAGEM DO CANAL 4: %.2f%%\n\nAUDIÊNCIA TOTAL CANAL 7: %d\nPORCENTAGEM DO CANAL 7: %.2f%%\n\nAUDIÊNCIA TOTAL CANAL 12: %d\nPORCENTAGEM DO CANAL 12: %.2f%%\n", audienciaCanal4, porcentagemCanal4, audienciaCanal7, porcentagemCanal7, audienciaCanal12, porcentagemCanal12);
        System.out.println();
        System.out.printf("CANAL MAIS ASSISTIDO: %s\nMÉDIA DE PESSOAS QUE ESTAVAM ASSISTINDO TV: %.2f", canalMaisAssistido, media);
    }
}
