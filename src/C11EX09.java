import javax.swing.JOptionPane;

public class C11EX09 
{
    public static void main(String[] args) 
    {
        String nomeFuncionario = "", setor, rf = "", nomeMaiorSetor = "", primeiroFuncionario = "", primeiroRF = "";
        int anoEntrada, ordemEntrada = 0, codSetor = 0, setor1 = 0, setor2 = 0, setor3 = 0, setor4 = 0, funcionarios2010 = 0, maiorSetor = 0;

        anoEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe o ano de entrada do funcionário: ",
        "Exercício 09",
        JOptionPane.QUESTION_MESSAGE));

        while (anoEntrada != 0) 
        {

            if (ordemEntrada > 999) 
            {
                break;
            }
            while (anoEntrada < 2010 || anoEntrada > 2014) 
            {
                JOptionPane.showMessageDialog(null, 
                "REGISTRO INVÁLIDO!", 
                "", 
                JOptionPane.WARNING_MESSAGE);    

                anoEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o ano de entrada do funcionário: ",
                "Exercício 09",
                JOptionPane.QUESTION_MESSAGE));
            }

            nomeFuncionario = JOptionPane.showInputDialog(null,
            "Informe o nome do funcionário: ",
            "Exercício 09",
            JOptionPane.QUESTION_MESSAGE);

            ordemEntrada++;

            setor = JOptionPane.showInputDialog(null,
            "Informe o setor do funcionário: ",
            "Exercício 09",
            JOptionPane.QUESTION_MESSAGE);

            if (setor.equalsIgnoreCase("gerencia") || setor.equalsIgnoreCase("gerência"))
            {
                codSetor = 1;
                setor1++;

            } else if (setor.equalsIgnoreCase("administracao") || setor.equalsIgnoreCase("administração"))
            {
                codSetor = 2;
                setor2++;

            } else if (setor.equalsIgnoreCase("pesquisa"))
            {
                codSetor = 3;
                setor3++;

            } else if (setor.equalsIgnoreCase("obras")) 
            {
                codSetor = 4;
                setor4++;

            } else
            {
                while (true)
                {
                    JOptionPane.showMessageDialog(null, 
                    "REGISTRO INVÁLIDO!", 
                    "", 
                    JOptionPane.WARNING_MESSAGE);  

                    setor = JOptionPane.showInputDialog(null,
                    "Informe o setor do funcionário: ",
                    "Exwercício 09",
                    JOptionPane.QUESTION_MESSAGE);
                }
            }

            rf = String.format("%02d%d%03d",  anoEntrada % 100, codSetor, ordemEntrada);  

            if (ordemEntrada == 1) 
            {
             primeiroFuncionario = nomeFuncionario;  
             primeiroRF = rf;
            }

            if (anoEntrada == 2010)
            {
                funcionarios2010++;
            }
            

            anoEntrada = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o ano de entrada do funcionário: ",
            "Exercício 09",
            JOptionPane.QUESTION_MESSAGE));
        }
         
        if (setor1 == setor2 && setor2 == setor3)
        {
            System.out.println("TODOS OS SETORES POSSUEM A MESMA QUANTIDADE DE FUNCIONÁRIOS!");
        } else
        {
        maiorSetor = Math.max(setor1, Math.max(setor2, Math.max(setor3, setor4))); 
        }
        

        if (maiorSetor == setor1) 
        {
            nomeMaiorSetor = "GERÊNCIA";

        } else if (maiorSetor == setor2) 
        {
            nomeMaiorSetor = "ADMINISTRAÇÃO";

        } else if (maiorSetor == setor3) 
        {
            nomeMaiorSetor = "PESQUISA";

        } else if (maiorSetor == setor4) 
        {
            nomeMaiorSetor = "OBRAS";

        }

        System.out.printf("SETOR 1: %d funcionário(s) ----- SETOR 2: %d funcionário(s) ----- SETOR 3: %d funcionàrio(s) ----- SETOR 4: %d funcionàrio(s)\nQUANTIDADE DE ADMINISTRADORES ADMITIDOS EM 2010: %d funcionário(s)\nNOME DO MAIOR SETOR: %s\nPRIMEIRO FUNCIONÁRIO CONTRATADO: %s - %s\nÚLTIMO FUNCIONÁRIO ADMITIDO: %s - RF%s\n", setor1, setor2, setor3, setor4, funcionarios2010, nomeMaiorSetor, primeiroFuncionario.toUpperCase(), primeiroRF, nomeFuncionario.toUpperCase(), rf);

    }
}
